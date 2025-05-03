package com.example.demo.Controller;

import com.example.demo.Entity.Department;
import com.example.demo.services.DepartmentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentManager departmentManager;

    @Autowired
    public DepartmentController(DepartmentManager departmentManager) {
        this.departmentManager = departmentManager;
    }

    // Get all departments
    @GetMapping("/all")
    public Iterable<Department> getAll() {
        return departmentManager.findAll();
    }

    // Get a department by id using a request parameter
    @GetMapping("/id")
    public Optional<Department> getById(@RequestParam Long id) {
        return departmentManager.findById(id);
    }

    // Get a department by id using a path variable in the URL
    @GetMapping("/{departmentId}")
    public Optional<Department> getByIdPath(@PathVariable Long departmentId) {
        return departmentManager.findById(departmentId);
    }

    // Create or update a department
    @PostMapping("/save")
    public Department save(@RequestBody Department department) {
        return departmentManager.save(department);
    }

    // Delete a department by id
    @DeleteMapping("/{departmentId}")
    public void delete(@PathVariable Long departmentId) {
        departmentManager.deleteById(departmentId);
    }
}
