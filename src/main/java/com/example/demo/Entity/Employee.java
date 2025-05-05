//package com.example.demo.Entity;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import jakarta.persistence.*;
//import java.math.BigDecimal;
//import java.util.List;
//
//@Entity
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false, length = 50)
//    private String firstName;
//
//    @Column(nullable = false, length = 50)
//    private String lastName;
//
//    private BigDecimal salary;
//
//    @Column(length = 50)
//    private String job;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "idDept", foreignKey = @ForeignKey(name = "FK_EmpDept"))
//    @JsonBackReference
//    private Department department;
//
//    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
//    @JsonIgnore
//    private List<Project> projects;
//
//    // Konstruktory
//    public Employee() {
//        super();
//    }
//
//    public Employee(String firstName, String lastName, BigDecimal salary, Department department, String job) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.salary = salary;
//        this.department = department;
//        this.job = job;
//    }
//
//    // Gettery i settery
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public BigDecimal getSalary() {
//        return salary;
//    }
//
//    public void setSalary(BigDecimal salary) {
//        this.salary = salary;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
//
//    public List<Project> getProjects() {
//        return projects;
//    }
//    public void setProjects(List<Project> projects) {
//        this.projects = projects;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +
//                ", job=" + job + ", salary=" + salary + ", department=" + (department != null ? department.getIdDept() : "null") + "]";
//    }
//}
