package ma.ensa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int companyPk;
    public String Name;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Employes> employes;

    public Entreprise() {
    }

    public Entreprise(String name, List<Employes> employes) {
        Name = name;
        this.employes = employes;
    }

    public int getCompanyPk() {
        return companyPk;
    }

    public void setCompanyPk(int companyPk) {
        this.companyPk = companyPk;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Employes> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employes> employes) {
        this.employes = employes;
    }
}

