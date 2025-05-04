//package com.example.demo.services;
//
//import com.example.demo.Entity.Project;
//import com.example.demo.repository.ProjectRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class ProjectManager {
//
//    private final ProjectRepository projectRepository;
//
//    @Autowired
//    public ProjectManager(ProjectRepository projectRepository) {
//        this.projectRepository = projectRepository;
//    }
//
//    // Znajdź projekt po ID i pracowniku
//    public Optional<Project> findByIdAndEmployeeId(Long projectId, Long employeeId) {
//        return projectRepository.findByIdAndEmployeeId(projectId, employeeId);
//    }
//
//    // Zapisz projekt
//    public Project save(Project project) {
//        return projectRepository.save(project);
//    }
//}
