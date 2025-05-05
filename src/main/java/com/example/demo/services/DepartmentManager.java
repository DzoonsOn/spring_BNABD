//package com.example.demo.services;
//
//import com.example.demo.repository.DepartmentRepository;
//import com.example.demo.Entity.Department;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class DepartmentManager {
//
//    private final DepartmentRepository departmentRepository;
//
//    @Autowired
//    public DepartmentManager(DepartmentRepository departmentRepository) {
//        this.departmentRepository = departmentRepository;
//    }
//
//    // Find a department by ID
//    public Optional<Department> findById(Long id) {
//        return departmentRepository.findById(id);
//    }
//
//    // Find all departments
//    public Iterable<Department> findAll() {
//        return departmentRepository.findAll();
//    }
//
//    // Save a department
//    public Department save(Department department) {
//        return departmentRepository.save(department);
//    }
//
//    // Delete a department by ID
//    public void deleteById(Long id) {
//        departmentRepository.deleteById(id);
//    }
//}
