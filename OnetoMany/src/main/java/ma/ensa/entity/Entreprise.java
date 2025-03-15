package ma.ensa.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 * @author FAHLAOUI MOHAMMED
 * @author haytam soukrati
 */

/**
 * The Entreprise class represents a company entity.
 * It includes attributes and relationships specific to companies.
 * This class uses JPA annotations for ORM mapping.
 */
@Entity
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int companyPk;
    public String Name;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Employes> employes;

    /**
     * Default constructor for the Entreprise class.
     * Initializes the company with default values.
     */
    public Entreprise() {
    }

    /**
     * Constructor for the Entreprise class.
     * Initializes the company with the specified name and list of employees.
     *
     * @param name the name of the company
     * @param employes the list of employees associated with the company
     */
    public Entreprise(String name, List<Employes> employes) {
        Name = name;
        this.employes = employes;
    }

    /**
     * Gets the primary key of the company.
     *
     * @return the primary key of the company
     */
    public int getCompanyPk() {
        return companyPk;
    }

    /**
     * Sets the primary key of the company.
     *
     * @param companyPk the primary key to set
     */
    public void setCompanyPk(int companyPk) {
        this.companyPk = companyPk;
    }

    /**
     * Gets the name of the company.
     *
     * @return the name of the company
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the name of the company.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Gets the list of employees associated with the company.
     *
     * @return the list of employees
     */
    public List<Employes> getEmployes() {
        return employes;
    }

    /**
     * Sets the list of employees associated with the company.
     *
     * @param employes the list of employees to set
     */
    public void setEmployes(List<Employes> employes) {
        this.employes = employes;
    }
}