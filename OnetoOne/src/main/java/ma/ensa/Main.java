package ma.ensa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ma.ensa.entity.Adresse;
import ma.ensa.entity.Etudiant1;

import java.util.List;
/**
 * @author FAHLAOUI MOHAMMED
 * @author hayteme sokrati
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transac = em.getTransaction();
        transac.begin();


        Etudiant1 etudiant = new Etudiant1("fahlaoui","mohammed",new Adresse());
        Etudiant1 etudiant2 = new Etudiant1("sokrati","hayteme",new Adresse());
        Adresse adresse = new Adresse();
        adresse.setCity("fes");
        adresse.setPostalCode("30050");
        adresse.setEtudiant(etudiant);
        etudiant.setAdresse(adresse);

        em.persist(etudiant);
        em.persist(etudiant2);
        List<Etudiant1> etudiant1List =em.createQuery("select e from Etudiant1 e",Etudiant1.class).getResultList();
        for (Etudiant1 etudiant1 : etudiant1List) {
            System.out.println("etudiant >> "+etudiant1.getNom());
        }
        em.createQuery("delete  from Etudiant1 e where e.nom='sokrati' ",Etudiant1.class).executeUpdate();
        System.out.println("etudiand hayteme is deleted");
        em.createQuery("update Etudiant1 e set e.nom='test' where e.nom='fahlaoui'",Etudiant1.class).executeUpdate();
        System.out.println("etudiant fahlaoui is updated");
        transac.commit();

        em.close();
        emf.close();

    }
}