package ma.ensa.entity;

import jakarta.persistence.*;

/**
 * @author FAHLAOUI MOHAMMED
 * @author haytam soukrati
 */

/**
 * The Personne class represents a person entity with common attributes.
 * It is the base class for other entities that inherit from it.
 * This class uses JPA annotations for ORM mapping.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(options = "ENGINE=InnoDB")
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String telephone;

    /**
     * Gets the ID of the person.
     *
     * @return the ID of the person
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the person.
     *
     * @param id the ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the last name of the person.
     *
     * @return the last name of the person
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the last name of the person.
     *
     * @param nom the last name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets the first name of the person.
     *
     * @return the first name of the person
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets the first name of the person.
     *
     * @param prenom the first name to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Gets the address of the person.
     *
     * @return the address of the person
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Sets the address of the person.
     *
     * @param adresse the address to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Gets the telephone number of the person.
     *
     * @return the telephone number of the person
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the telephone number of the person.
     *
     * @param telephone the telephone number to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}