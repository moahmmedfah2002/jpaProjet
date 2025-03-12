package ma.ensa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Etudiant extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    @ManyToMany
    private List<Prof> courList;

    public  Etudiant(){
            nom="fahlaoui";
            prenom="mohammed";
            adresse=".......";
            telephone=".......";
    }


    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Prof> getCourList() {
        return courList;
    }

    public void setCourList(List<Prof> courList) {
        this.courList = courList;
    }
}
