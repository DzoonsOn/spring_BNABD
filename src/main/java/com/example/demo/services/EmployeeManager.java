//package com.example.demo.services;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.StreamSupport;
//
//import com.example.demo.DTO.EmpDto;
//import com.example.demo.Entity.Employee;
//import com.example.demo.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.PageRequest;
//
//
//@Service
//public class EmployeeManager {
//
//    private final EmployeeRepository employeeRepository;
//
//    @Autowired
//    public EmployeeManager(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    // Znajdź pracownika po ID
//    public Optional<Employee> findById(Long id) {
//        return employeeRepository.findById(id);
//    }
//
//    // Znajdź wszystkich pracowników
//    public List<Employee> findAll() {
//        return employeeRepository.findAll();
//    }
//
//    // Pobierz listę DTO (id, lastName)
//    public List<EmpDto> findAllEmployeeDtos() {
//        return employeeRepository.findAll()
//                .stream()
//                .map(employee -> new EmpDto(employee.getId(), employee.getLastName()))
//                .collect(Collectors.toList());
//    }
//
//    // Zapisz lub aktualizuj pracownika
//    public Employee save(Employee employee) {
//        employee.setId(null);
//        return employeeRepository.save(employee);
//    }
//
//    // Usuń pracownika po ID
//    public void deleteById(Long id) {
//        employeeRepository.deleteById(id);
//    }
//
//    public Page<Employee> findAll(Pageable pageable) {
//        return employeeRepository.findAll(pageable);
//    }
//
//    public List<Employee> getSortedByLastNameAscAndSalaryDesc() {
//        Sort sort = Sort.by(Sort.Order.asc("lastName"), Sort.Order.desc("salary"));
//        return employeeRepository.findAll(sort);
//    }
//
//    public List<Employee> findByFirstNameIgnoreCase(String firstName) {
//        return employeeRepository.findByFirstNameIgnoreCase(firstName);
//    }
//
//    public List<Employee> getTopEmployeesBySalary(int n) {
//        Pageable pageable = PageRequest.of(0, n, Sort.by(Sort.Order.desc("salary")));
//        return employeeRepository.findAll(pageable).getContent();
//    }
//
//
//    public List<EmpDto> findAllNames() {
//        return getCollect();
//    }
//
//    private List<EmpDto> getCollect() {
//        return StreamSupport.stream(employeeRepository.findAll().spliterator(), false)
//                .map(employee -> new EmpDto(employee.getId(), employee.getLastName()))
//                .collect(Collectors.toList());
//    }
//
//}
