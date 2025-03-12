package ma.ensa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Prof extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String nom;
    @ManyToMany
    private List<Etudiant> etudiantList;


}
