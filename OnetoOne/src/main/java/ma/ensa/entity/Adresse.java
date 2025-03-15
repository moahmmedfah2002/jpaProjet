package ma.ensa.entity;

import jakarta.persistence.*;

/**
 * @author FAHLAOUI MOHAMMED
 * @author haytam soukrati
 */
@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String postalCode;
   private String city;
   @OneToOne
   private Etudiant1 Etudiant;

    /**
     *
     * @return id of student is a int
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id you should give a id of student
     *
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return postalCode of student is an int
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     *
     * @param postalCode you should enter a postalCode of student witch is String value
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     *
     * @return city of student is a String value
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city you should enter city of student is a String value
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return an object of Student
     */
    public Etudiant1 getEtudiant() {
        return Etudiant;
    }

    /**
     *
     * @param etudiant is a list of Student
     */
    public void setEtudiant(Etudiant1 etudiant) {
        Etudiant = etudiant;
    }
}
