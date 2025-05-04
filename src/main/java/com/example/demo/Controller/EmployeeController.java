package com.example.demo.Controller;

import com.example.demo.DTO.EmpDto;
import com.example.demo.services.EmployeeManager;
import com.example.demo.Entity.Employee;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
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
    public List<Employee> getAll() {
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

    // Pobierz DTO pracowników (id i nazwisko)
    @GetMapping("/names")
    public List<EmpDto> getAllEmployeeNames() {
        return employeeManager.findAllEmployeeDtos();
    }

    // Zapisz pracownika
    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        employee.setId(null); // zawsze twórz nowy
        return employeeManager.save(employee);
    }
    // Usuń pracownika po ID
    @DeleteMapping("/{employeeId}")
    public void delete(@PathVariable Long employeeId) {
        employeeManager.deleteById(employeeId);
    }

    @GetMapping("/paged")
    public Page<Employee> getPagedEmployees(@RequestParam(defaultValue = "0") int page,
                                            @RequestParam(defaultValue = "5") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return employeeManager.findAll(pageable);
    }
    @GetMapping("/sort-custom")
    public List<Employee> getEmployeesSortedByLastNameAndSalary() {
        return employeeManager.getSortedByLastNameAscAndSalaryDesc();
    }

    @GetMapping("/by-name")
    public List<Employee> getByFirstNameIgnoreCase(@RequestParam String name) {
        return employeeManager.findByFirstNameIgnoreCase(name);
    }

    @GetMapping("/top-salary")
    public List<Employee> getTopEmployeesBySalary(@RequestParam(defaultValue = "5") int count) {
        return employeeManager.getTopEmployeesBySalary(count);
    }


}
