package ma.ensa.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 * @author FAHLAOUI MOHAMMED
 * @author haytam soukrati
 */

/**
 * The Etudiant class represents a student entity that extends the Personne class.
 * It includes additional attributes and relationships specific to students.
 * This class uses JPA annotations for ORM mapping.
 */
@Entity
@Table(options = "ENGINE=InnoDB")
public class Etudiant extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @ManyToMany
    @JoinTable(
            name = "etudiant_Prof",
            joinColumns = @JoinColumn(name = "id_etudiant"),
            inverseJoinColumns = @JoinColumn(name = "id_prof"))
    private List<Prof> profList;

    /**
     * Default constructor for the Etudiant class.
     * Initializes the student with default values.
     */
    public Etudiant() {
        nom = "fahlaoui";
        prenom = "mohammed";
        adresse = ".......";
        telephone = ".......";
    }

    /**
     * Gets the ID of the student.
     *
     * @return the ID of the student
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the student.
     *
     * @param etudiant_id the ID to set
     */
    public void setId(int etudiant_id) {
        this.id = etudiant_id;
    }

    /**
     * Gets the list of professors associated with the student.
     *
     * @return the list of professors
     */
    public List<Prof> getProfList() {
        return profList;
    }

    /**
     * Sets the list of professors associated with the student.
     *
     * @param profList the list of professors to set
     */
    public void setProfList(List<Prof> profList) {
        this.profList = profList;
    }
}