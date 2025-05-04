//package com.example.demo.Controller;
//
//import com.example.demo.Entity.Employee;
//import com.example.demo.Entity.Project;
//import com.example.demo.services.ProjectManager;
//import com.example.demo.services.EmployeeManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/employees/{employeeId}/projects")
//public class ProjectController {
//
//    private final ProjectManager projectManager;
//    private final EmployeeManager employeeManager;
//
//    @Autowired
//    public ProjectController(ProjectManager projectManager, EmployeeManager employeeManager) {
//        this.projectManager = projectManager;
//        this.employeeManager = employeeManager;
//    }
//
//    // Pobierz projekt dla pracownika
//    @GetMapping("/{projectId}")
//    public Optional<Project> getProjectById(@PathVariable Long employeeId, @PathVariable Long projectId) {
//        Optional<Employee> employee = employeeManager.findById(employeeId);
//
//        if (employee.isPresent()) {
//            // Jeśli pracownik istnieje, znajdź projekt przypisany do tego pracownika
//            return projectManager.findByIdAndEmployeeId(projectId, employeeId);
//        }
//
//        return Optional.empty();
//    }
//
//
//
//    // Utwórz nowy projekt dla pracownika
//    @PostMapping("/save")
//    public Project saveProjectForEmployee(@PathVariable Long employeeId, @RequestBody Project project) {
//        Optional<Employee> employee = employeeManager.findById(employeeId);
//
//        if (employee.isPresent()) {
//            // Przypisz projekt do pracownika
//            project.setEmployee(employee.get());
//            return projectManager.save(project);
//        }
//
//        throw new RuntimeException("Employee not found");
//    }
//}
