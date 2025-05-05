package com.example.demo.Controller;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Project;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.ProjectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectRepository projectRepository;
    private final EmployeeRepository employeeRepository;

    public ProjectController(ProjectRepository projectRepository, EmployeeRepository employeeRepository) {
        this.projectRepository = projectRepository;
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        if (project.getEmployee() != null && project.getEmployee().getId() != null) {
            Employee emp = employeeRepository.findById(project.getEmployee().getId())
                    .orElseThrow(() -> new RuntimeException("Employee not found"));
            project.setEmployee(emp);
        } else {
            throw new RuntimeException("Employee ID must not be null");
        }

        return projectRepository.save(project);
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable Long id, @RequestBody Project updated) {
        return projectRepository.findById(id)
                .map(project -> {
                    project.setProjectName(updated.getProjectName());
                    project.setProjectDescription(updated.getProjectDescription());
                    project.setStartDate(updated.getStartDate());
                    project.setEndDate(updated.getEndDate());

                    if (updated.getEmployee() != null && updated.getEmployee().getId() != null) {
                        Employee emp = employeeRepository.findById(updated.getEmployee().getId())
                                .orElseThrow(() -> new RuntimeException("Employee not found"));
                        project.setEmployee(emp);
                    }

                    return projectRepository.save(project);
                })
                .orElseThrow(() -> new RuntimeException("Project not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectRepository.deleteById(id);
    }
}
