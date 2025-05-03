package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String projectName;
    private String projectDescription;
    private LocalDate startDate;
    private LocalDate endDate;

    // Relacja ManyToOne: Jeden projekt należy do jednego pracownika
    @ManyToOne
    @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "FK_Employee_Project"))
    private Employee employee;

    // Relacja ManyToOne: Jeden projekt należy do jednego działu
    @ManyToOne
    @JoinColumn(name = "idDept", foreignKey = @ForeignKey(name = "FK_Dept_Project"))
    private Department department;

    // Konstruktor
    public Project() {}

    public Project(String projectName, String projectDescription, LocalDate startDate, LocalDate endDate, Employee employee, Department department) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employee = employee;
        this.department = department;
    }

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Project [id=" + id + ", projectName=" + projectName + ", projectDescription=" + projectDescription +
                ", startDate=" + startDate + ", endDate=" + endDate + ", employee=" + employee + ", department=" + department + "]";
    }
}
