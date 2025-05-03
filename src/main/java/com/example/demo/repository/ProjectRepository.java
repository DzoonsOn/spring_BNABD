package com.example.demo.repository;

import com.example.demo.Entity.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    // Znajdź projekt po ID i ID pracownika
    Optional<Project> findByIdAndEmployeeId(Long projectId, Long employeeId);
}
