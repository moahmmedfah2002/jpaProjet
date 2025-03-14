package ma.ensa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adresse {
    @Id
   private int id;
   private String postalCode;
   private String city;
   @OneToOne
   private Etudiant1 Etudiant;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ma.ensa.entity.Etudiant1 getEtudiant() {
        return Etudiant;
    }

    public void setEtudiant(ma.ensa.entity.Etudiant1 etudiant) {
        Etudiant = etudiant;
    }
}
