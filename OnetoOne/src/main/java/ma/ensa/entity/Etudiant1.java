package ma.ensa.entity;

import jakarta.persistence.*;
/**
 * @author FAHLAOUI MOHAMMED
 * @author hayteme sokrati
 */
@Entity
public class Etudiant1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    @OneToOne(cascade = {CascadeType.PERSIST})
    private Adresse adresse;

    /**
     *
     * @return address of student is a String value
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * this methode construct object of student with empty values
     */
    public Etudiant1(){

    }

    /**
     * this methode construct object of student with values
     * @param nom lastname of student is a String value
     * @param prenom firstname of student is a String value
     * @param adresse address of student is a String value
     */
    public Etudiant1(String nom, String prenom, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    /**
     *
     * @param adresse you should enter an object of address of student
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     *
     * @return firstname of student is a String Value
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom you should enter firstname of student is String value
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return lastname of Student is a String value
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom you should enter lastname of student is a String value
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return id of Student is an int value
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id you should enter an id of student is an int value
     */
    public void setId(int id) {
        this.id = id;
    }
}
