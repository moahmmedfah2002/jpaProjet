package ma.ensa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(options = "ENGINE=InnoDB")
public class Etudiant extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int etudiant_id) {
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
            joinColumns = @JoinColumn(name = "id_etudiant"),
            inverseJoinColumns = @JoinColumn(name = "id_prof"))
    private List<Prof> profList;

    public  Etudiant(){
            nom="fahlaoui";
            prenom="mohammed";
            adresse=".......";
            telephone=".......";
    }




}
