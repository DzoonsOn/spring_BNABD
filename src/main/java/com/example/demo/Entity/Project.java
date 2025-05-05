//package com.example.demo.Entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//import java.time.LocalDate;
//
//@Entity
//public class Project {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idProject;
//
//    private String projectName;
//    private String projectDescription;
//    private LocalDate startDate;
//    private LocalDate endDate;
//
//    @ManyToOne
//    @JoinColumn(name = "id", foreignKey = @ForeignKey(name = "FK_Employee_Project"))
//    private Employee employee;
//
//    public Project() {}
//
//    public Project(String projectName, String projectDescription, LocalDate startDate, LocalDate endDate, Employee employee) {
//        this.projectName = projectName;
//        this.projectDescription = projectDescription;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.employee = employee;
//    }
//
//    public Long getIdProject() {
//        return idProject;
//    }
//
//    public void setIdProject(Long idProject) {
//        this.idProject = idProject;
//    }
//
//    public String getProjectName() {
//        return projectName;
//    }
//
//    public void setProjectName(String projectName) {
//        this.projectName = projectName;
//    }
//
//    public String getProjectDescription() {
//        return projectDescription;
//    }
//
//    public void setProjectDescription(String projectDescription) {
//        this.projectDescription = projectDescription;
//    }
//
//    public LocalDate getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(LocalDate startDate) {
//        this.startDate = startDate;
//    }
//
//    public LocalDate getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(LocalDate endDate) {
//        this.endDate = endDate;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    public String toString() {
//        return "Project [idProject=" + idProject + ", projectName=" + projectName + ", projectDescription=" + projectDescription + ", startDate="+startDate+", endDate="+endDate+", employee="+employee+"]";
//    }
//}
