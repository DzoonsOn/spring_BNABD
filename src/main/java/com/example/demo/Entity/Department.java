//package com.example.demo.Entity;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import jakarta.persistence.*;
//import java.util.List;
//
//@Entity
//public class Department {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idDept;
//
//    @Column(nullable = false, length = 50)
//    private String deptName;
//
//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private List<Employee> employees;
//
//    public Long getIdDept() {
//        return idDept;
//    }
//
//    public void setIdDept(Long idDept) {
//        this.idDept = idDept;
//    }
//
//    public String getDeptName() {
//        return deptName;
//    }
//
//    public void setDeptName(String deptName) {
//        this.deptName = deptName;
//    }
//
//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }
//}
