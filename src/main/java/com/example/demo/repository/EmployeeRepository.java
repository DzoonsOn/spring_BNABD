//package com.example.demo.repository;
//
//import com.example.demo.Entity.Employee;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//
//import java.util.List;
//
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//
//    // Znajdź pracowników po imieniu
//    List<Employee> findByFirstName(String firstName);
//
//    // Znajdź pracowników po nazwisku
//    List<Employee> findByLastNameContainingIgnoreCase(String lastName);
//
//    // Znajdź pracowników, których nazwisko zaczyna się na literę 'K'
//    List<Employee> findByLastNameStartingWithIgnoreCase(String prefix);
//
//    Page<Employee> findAll(Pageable pageable);
//
//    List<Employee> findByFirstNameIgnoreCase(String firstName);
//
//    List<Employee> findTopNByOrderBySalaryDesc();
//
//}
