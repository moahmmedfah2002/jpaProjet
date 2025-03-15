package ma.ensa.entity;

import jakarta.persistence.*;
/**
 * @author FAHLAOUI MOHAMMED
 * @author haytam soukrati
 */

/**
 * The Employes class represents an employee entity.
 * It includes attributes and relationships specific to employees.
 * This class uses JPA annotations for ORM mapping.
 */
@Entity
@NamedQuery(name = "select",
        query = "select u from Employes u")
public class Employes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeePK;
    private String name;
    private Sex sex;
    @ManyToOne(cascade = CascadeType.ALL)
    private Entreprise entreprise;

    /**
     * Default constructor for the Employes class.
     * Initializes the employee with default values.
     */
    public Employes() {
    }

    /**
     * Constructor for the Employes class.
     * Initializes the employee with the specified name, sex, and entreprise.
     *
     * @param name the name of the employee
     * @param sex the sex of the employee
     * @param entreprise the entreprise associated with the employee
     */
    public Employes(String name, Sex sex, Entreprise entreprise) {
        this.name = name;
        this.sex = sex;
        this.entreprise = entreprise;
    }

    /**
     * Constructor for the Employes class.
     * Initializes the employee with the specified name and sex.
     *
     * @param name the name of the employee
     * @param sex the sex of the employee
     */
    public Employes(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    /**
     * Gets the primary key of the employee.
     *
     * @return the primary key of the employee
     */
    public int getEmployeePK() {
        return employeePK;
    }

    /**
     * Sets the primary key of the employee.
     *
     * @param employeePK the primary key to set
     */
    public void setEmployeePK(int employeePK) {
        this.employeePK = employeePK;
    }

    /**
     * Gets the name of the employee.
     *
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the sex of the employee.
     *
     * @return the sex of the employee
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets the sex of the employee.
     *
     * @param sex the sex to set
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * Gets the entreprise associated with the employee.
     *
     * @return the entreprise associated with the employee
     */
    public Entreprise getEntreprise() {
        return entreprise;
    }

    /**
     * Sets the entreprise associated with the employee.
     *
     * @param entreprise the entreprise to set
     */
    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}