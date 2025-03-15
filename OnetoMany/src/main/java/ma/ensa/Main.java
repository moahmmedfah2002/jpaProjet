package ma.ensa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ma.ensa.entity.Employes;
import ma.ensa.entity.Entreprise;
import ma.ensa.entity.Sex;

import java.util.List;

/**
 * @author FAHLAOUI MOHAMMED
 * @author hayteme sokrati
 */
public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transac = em.getTransaction();
        transac.begin();

        // Retrieve all employees
        List<Employes> employes = em.createQuery("select e from Employes e", Employes.class).getResultList();
        for (Employes employ : employes) {
            System.out.println(employ.getEmployeePK());
        }

        // Create companies and employees (by cascade)
        Entreprise entreprise = new Entreprise("Capgemini", List.of(
                new Employes("Yassine", Sex.Feminin),
                new Employes("Ahamed", Sex.Masculin)
        ));
        for (Employes employ : entreprise.getEmployes()) {
            employ.setEntreprise(entreprise);
        }
        Entreprise entreprise1 = new Entreprise("Adams", List.of(
                new Employes("Joly", Sex.Feminin),
                new Employes("Jake", Sex.Masculin)
        ));
        for (Employes employ : entreprise1.getEmployes()) {
            employ.setEntreprise(entreprise1);
        }
        em.persist(entreprise1);
        em.persist(entreprise);
        transac.commit();
        transac.begin();

        // Update employee list
        Entreprise entr = em.find(Entreprise.class, 1);
        if (entr != null) {
            Employes empToRemove = entr.getEmployes().get(0);
            entr.getEmployes().remove(empToRemove);
            System.out.println(entr.getEmployes().size());
            em.remove(empToRemove);
        } else {
            System.out.println("no employee found for this company");
        }

        transac.commit();
        em.close();
        emf.close();
    }
}