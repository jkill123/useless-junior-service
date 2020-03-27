package com.example.uslessjuniorservice.service.project;

import com.example.uslessjuniorservice.domain.Project;
import com.example.uslessjuniorservice.model.ProjectDto;

import java.util.List;
import java.util.Optional;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 11:52
 */
public interface ProjectService {
    void saveNewProject(ProjectDto projectDto);
    Optional<List<Project>> getAllProjects();
    void addEmployeeToProject(Integer projectId, Integer employeeId);
    void updateEmployeeInProject(Integer projectId, Integer employeeId, Integer updatedEmployeeId);
    void deleteEmployeeFromProject(Integer projectId, Integer employeeId);
}
