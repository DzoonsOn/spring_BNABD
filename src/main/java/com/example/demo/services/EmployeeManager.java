package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.example.demo.DTO.EmpDto;
import com.example.demo.Entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeManager(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    // Find an employee by ID
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    // Find all employees
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public List<EmpDto> findAllNames() {
        return getCollect();
    }


    private List<EmpDto> getCollect() {
        return StreamSupport.stream(employeeRepository.findAll().spliterator(), false)
                .map(employee -> new EmpDto(employee.getId(), employee.getLastName()))
                .collect(Collectors.toList());
    }

    // Save an employee
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Delete an employee by ID
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
