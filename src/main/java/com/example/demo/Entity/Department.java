package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDept;

    private String dName;
    private String job;

    // Relacja OneToMany: Jeden dział może mieć wielu pracowników
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Employee> employees;

    // Konstruktor
    public Department() {
        super();
    }

    public Department(String dName, String job) {
        this.dName = dName;
        this.job = job;
    }

    // Gettery i settery
    public Long getIdDept() {
        return idDept;
    }

    public void setIdDept(Long idDept) {
        this.idDept = idDept;
    }

    public String getDName() {
        return dName;
    }

    public void setDName(String dName) {
        this.dName = dName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @JsonIgnore  // Ignorujemy listę pracowników podczas serializacji JSON
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department [idDept=" + idDept + ", deptName=" + dName + "]";
    }
}
