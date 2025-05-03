package com.example.demo.repository;

import com.example.demo.Entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    // Znajdź pracowników po imieniu
    Iterable<Employee> findByFirstName(String firstName);

//    // Znajdź pracowników po nazwisku
//    @Query("Select e FROM Employee e where e.lastName LIKE ?1")
//    Iterable<Employee> findByLastName(String lastName);
//
//    // Znajdź pracowników, których nazwisko zaczyna się na literę 'K'
//    @Query("Select e FROM Employee e where e.lastName LIKE 'K%'")
//    Iterable<Employee> findByLastNameStartingWithK();
}
