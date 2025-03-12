package ma.ensa.entity;

import jakarta.persistence.*;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue
    private int id;
    private String nom;
    private String prenom;
    @OneToOne(cascade = {CascadeType.PERSIST})
    private Adresse adresse;

    public Adresse getAdresse() {
        return adresse;
    }
    public Etudiant(){

    }

    public Etudiant(int id, String nom, String prenom, Adresse adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
