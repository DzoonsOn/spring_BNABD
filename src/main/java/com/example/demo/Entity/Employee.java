package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private BigDecimal salary;

    // Relacja ManyToOne: Jeden pracownik może mieć jeden dział
    @ManyToOne
    @JoinColumn(name = "idDept", foreignKey = @ForeignKey(name = "FK_EmpDept"))
    private Department department;

    // Relacja OneToMany: Jeden pracownik może mieć wiele projektów
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private Set<Project> projects;

    // Konstruktor
    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, BigDecimal salary, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @JsonIgnore  // Ignorujemy odniesienie do działu podczas serializacji JSON
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    @JsonIgnore  // Ignorujemy odniesienie do działu podczas serializacji JSON
    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
    }
}
