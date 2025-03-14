package ma.ensa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Etudiant extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    public int getEtudiant_id() {
        return id;
    }

    public void setEtudiant_id(int etudiant_id) {
        this.id = etudiant_id;
    }

    public List<Prof> getProfList() {
        return profList;
    }

    public void setProfList(List<Prof> profList) {
        this.profList = profList;
    }

    @ManyToMany
    @JoinTable(
            name = "etudiant_Prof",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id"))    private List<Prof> profList;

    public  Etudiant(){
            nom="fahlaoui";
            prenom="mohammed";
            adresse=".......";
            telephone=".......";
    }




}
