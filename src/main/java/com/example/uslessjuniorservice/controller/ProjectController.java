package com.example.uslessjuniorservice.controller;

import com.example.uslessjuniorservice.domain.Project;
import com.example.uslessjuniorservice.model.EmployeeDto;
import com.example.uslessjuniorservice.model.ProjectDto;
import com.example.uslessjuniorservice.service.project.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 11:47
 */
@RequiredArgsConstructor
@RequestMapping("/api/v1/project")
@RestController
public class ProjectController {

    private final ProjectService projectService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewProject(@RequestBody ProjectDto projectDto) {
        projectService.saveNewProject(projectDto);
    }

    @CrossOrigin("*")
    @GetMapping()
    public Optional<List<Project>> getAllProjects() {
        return projectService.getAllProjects();
    }

    @PutMapping("/{projectId}/employee")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addEmployeeToProjectById(@PathVariable("projectId") Integer projectId, @RequestParam Integer employeeId) {
        projectService.addEmployeeToProject(projectId, employeeId);
    }

    @PutMapping("/{projectId}/employee/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployeeOnProjectById(@PathVariable("projectId") Integer projectId,
                                            @PathVariable("employeeId") Integer employeeId,
                                            @RequestParam Integer updatedEmployeeId) {
        projectService.updateEmployeeInProject(projectId, employeeId, updatedEmployeeId);
    }

    @DeleteMapping("/{projectId}/employee/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployeeFromProject(@PathVariable("projectId") Integer projectId,
                                          @PathVariable("employeeId") Integer employeeId) {
        projectService.deleteEmployeeFromProject(projectId, employeeId);
    }
}
