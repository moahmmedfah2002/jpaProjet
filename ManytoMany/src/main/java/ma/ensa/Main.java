package ma.ensa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ma.ensa.entity.Etudiant;

import ma.ensa.entity.Prof;


import java.util.ArrayList;
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

        em.persist(new Etudiant());
        Etudiant et = new Etudiant();
        et.setNom("test2");
        em.persist(et);

        Prof p = new Prof();

        List<Etudiant> etudiantList=new ArrayList<>();
        etudiantList.add(et);
        p.setEtudiantList(etudiantList);
        em.persist(p);
        List<Etudiant> etudiants= em.createQuery("select e from Etudiant e",Etudiant.class).getResultList();
        for(Etudiant e:etudiants)
            System.out.println("Etudiant >>"+e.getNom());
        List<Prof> profs= em.createQuery("select e from Prof e",Prof.class).getResultList();
        for(Prof pf :profs)
            System.out.println("prof >> "+pf.getNom());

//        em.createQuery("delete from Etudiant e where e.nom='test2'").executeUpdate();
//        System.out.println("etudiant test2 is remouved");
        em.createQuery("update Etudiant e set e.nom='fahlaoui_test' where e.nom='fahlaoui'").executeUpdate();
        System.out.println("etudiant fahlaoui is updated >> nom=fahlaoui_test");
        transac.commit();

        em.close();
        emf.close();

    }
}