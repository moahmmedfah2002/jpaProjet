package ma.ensa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ma.ensa.entity.Adresse;
import ma.ensa.entity.Etudiant1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transac = em.getTransaction();
        transac.begin();


        Etudiant1 etudiant = new Etudiant1("fahlaoui","mohammed",new Adresse());
        Adresse adresse = new Adresse();
        adresse.setCity("fes");
        adresse.setPostalCode("30050");
        adresse.setEtudiant(etudiant);
        etudiant.setAdresse(adresse);
        em.persist(etudiant);
        transac.commit();

        em.close();
        emf.close();

    }
}