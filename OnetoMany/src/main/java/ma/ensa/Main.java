package ma.ensa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ma.ensa.entity.Employes;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transac = em.getTransaction();
        transac.begin();

        Employes emp = new Employes();
        List<Employes> employes= em.createQuery("select e from Employes e",Employes.class).getResultList();

        for (Employes employ : employes) {
            System.out.println(employ.getEmployeePK());
        }


        Employes etudiant = new Employes();

        em.persist(etudiant);
        transac.commit();

        em.close();
        emf.close();

    }
}