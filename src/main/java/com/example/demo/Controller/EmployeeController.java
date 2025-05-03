package com.example.demo.Controller;

import com.example.demo.DTO.EmpDto;
import com.example.demo.services.EmployeeManager;
import com.example.demo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    // Pobierz wszystkich pracowników
    @GetMapping("/all")
    public Iterable<Employee> getAll() {
        return employeeManager.findAll();
    }

    // Pobierz pracownika po id za pomocą parametru
    @GetMapping("/id")
    public Optional<Employee> getById(@RequestParam Long index) {
        return employeeManager.findById(index);
    }

    // Pobierz pracownika po id za pomocą zmiennej w ścieżce URL
    @GetMapping("/{employeeId}")
    public Optional<Employee> getId(@PathVariable Long employeeId) {
        return employeeManager.findById(employeeId);
    }

    @GetMapping("/names")
    public List<EmpDto> getAllEmployeeNames() {
        return employeeManager.findAllNames();
    }
}
