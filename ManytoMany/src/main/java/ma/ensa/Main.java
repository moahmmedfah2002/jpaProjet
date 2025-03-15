package ma.ensa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ma.ensa.entity.Etudiant;
import ma.ensa.entity.Prof;

import java.util.ArrayList;
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

        // Persist new students
        em.persist(new Etudiant());
        Etudiant et = new Etudiant();
        et.setNom("test2");
        em.persist(et);

        // Persist new professor with a list of students
        Prof p = new Prof();
        List<Etudiant> etudiantList = new ArrayList<>();
        etudiantList.add(et);
        p.setEtudiantList(etudiantList);
        em.persist(p);

        // Retrieve and print all students
        List<Etudiant> etudiants = em.createQuery("select e from Etudiant e", Etudiant.class).getResultList();
        for (Etudiant e : etudiants) {
            System.out.println("Etudiant >>" + e.getNom());
        }

        // Retrieve and print all professors
        List<Prof> profs = em.createQuery("select e from Prof e", Prof.class).getResultList();
        for (Prof pf : profs) {
            System.out.println("prof >> " + pf.getNom());
        }

        // Update a student's name
        em.createQuery("update Etudiant e set e.nom='fahlaoui_test' where e.nom='fahlaoui'").executeUpdate();
        System.out.println("etudiant fahlaoui is updated >> nom=fahlaoui_test");

        transac.commit();
        em.close();
        emf.close();
    }
}