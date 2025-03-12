package ma.ensa.entity;

import jakarta.persistence.*;

@Entity
@NamedQuery(name = "select",
        query = "select u from Employes u")
public class Employes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeePK;
    private String name;
    private Sex sex;
    @ManyToOne
    private Entreprise entreprise;

    public int getEmployeePK() {
        return employeePK;
    }

    public void setEmployeePK(int employeePK) {
        this.employeePK = employeePK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}
