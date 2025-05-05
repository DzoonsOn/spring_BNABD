//package com.example.demo.services;
//
//import com.example.demo.Entity.Employee;
//import com.example.demo.Entity.Project;
//import com.example.demo.repository.EmployeeRepository;
//import com.example.demo.repository.ProjectRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProjectManager {
//
//    private final ProjectRepository projectRepository;
//    private final EmployeeRepository employeeRepository;
//
//    @Autowired
//    public ProjectManager(ProjectRepository projectRepository, EmployeeRepository employeeRepository) {
//        this.projectRepository = projectRepository;
//        this.employeeRepository = employeeRepository;
//    }
//
//    public Project save(Project project) {
//        if (project.getEmployee() != null && project.getEmployee().getId() != null) {
//            Employee employee = employeeRepository.findById(project.getEmployee().getId())
//                    .orElseThrow(() -> new RuntimeException("Employee not found"));
//            project.setEmployee(employee);
//        } else {
//            throw new RuntimeException("Employee ID must be provided");
//        }
//        return projectRepository.save(project);
//    }
//
//
//    public List<Project> findAll() {
//        return projectRepository.findAll();
//    }
//
//    public Optional<Project> findById(Long id) {
//        return projectRepository.findById(id);
//    }
//
////    public List<Project> findByEmployeeId(Long employeeId) {
////        return projectRepository.findByEmployeeId(employeeId);
////    }
//
//    public void deleteById(Long id) {
//        projectRepository.deleteById(id);
//    }
//}
