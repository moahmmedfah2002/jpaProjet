package ma.ensa.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 * @author FAHLAOUI MOHAMMED
 * @author haytam soukrati
 */

/**
 * The Prof class represents a professor entity that extends the Personne class.
 * It includes additional attributes and relationships specific to professors.
 * This class uses JPA annotations for ORM mapping.
 */
@Entity
@Table(options = "ENGINE=InnoDB")
public class Prof extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @ManyToMany
    @JoinTable(
            name = "etudiant_prof",
            joinColumns = @JoinColumn(name = "id_prof"),
            inverseJoinColumns = @JoinColumn(name = "id_Etudiant"))
    private List<Etudiant> etudiantList;

    /**
     * Default constructor for the Prof class.
     * Initializes the professor with default values.
     */
    public Prof() {
        nom = "fahlaoui";
        prenom = "mohammed";
        adresse = ".......";
        telephone = ".......";
    }

    /**
     * Gets the list of students associated with the professor.
     *
     * @return the list of students
     */
    public List<Etudiant> getEtudiantList() {
        return etudiantList;
    }

    /**
     * Sets the list of students associated with the professor.
     *
     * @param etudiantList the list of students to set
     */
    public void setEtudiantList(List<Etudiant> etudiantList) {
        this.etudiantList = etudiantList;
    }

    /**
     * Gets the last name of the professor.
     *
     * @return the last name of the professor
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the last name of the professor.
     *
     * @param nom the last name to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets the first name of the professor.
     *
     * @return the first name of the professor
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets the first name of the professor.
     *
     * @param prenom the first name to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Gets the address of the professor.
     *
     * @return the address of the professor
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Sets the address of the professor.
     *
     * @param adresse the address to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Gets the telephone number of the professor.
     *
     * @return the telephone number of the professor
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the telephone number of the professor.
     *
     * @param telephone the telephone number to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}