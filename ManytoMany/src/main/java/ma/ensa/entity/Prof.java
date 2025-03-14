package ma.ensa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(options = "ENGINE=InnoDB")
public class Prof extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @ManyToMany()
    @JoinTable(
            name = "etudiant_prof",
            joinColumns = @JoinColumn(name = "id_prof"),
            inverseJoinColumns = @JoinColumn(name = "id_Etudiant"))
    private List<Etudiant> etudiantList;


    public Prof(){
        nom="fahlaoui";
        prenom="mohammed";
        adresse=".......";
        telephone=".......";
    }

    public List<Etudiant> getEtudiantList() {
        return etudiantList;
    }

    public void setEtudiantList(List<Etudiant> etudiantList) {
        this.etudiantList = etudiantList;
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



}
