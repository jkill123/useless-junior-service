package com.example.uslessjuniorservice.service.project;

import com.example.uslessjuniorservice.domain.Employee;
import com.example.uslessjuniorservice.domain.Project;
import com.example.uslessjuniorservice.model.ProjectDto;
import com.example.uslessjuniorservice.repository.EmployeeRepository;
import com.example.uslessjuniorservice.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 12:04
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final EmployeeRepository employeeRepository;

    @Override
    public void saveNewProject(ProjectDto projectDto) {
        projectRepository.save(new Project(projectDto));
    }

    @Override
    public Optional<List<Project>> getAllProjects() {
        return Optional.of(projectRepository.findAll());
    }

    @Override
    public void addEmployeeToProject(Integer projectId, Integer employeeId) {
        projectRepository.findById(projectId).ifPresent(project -> {
            employeeRepository.findById(employeeId).ifPresent(employee -> {
                project.getEmployeeList().add(employee);
                projectRepository.save(project);
            });
        });
    }

    @Override
    public void updateEmployeeInProject(Integer projectId, Integer employeeId, Integer updatedEmployeeId) {
        projectRepository.findById(projectId).ifPresent(project -> {
            employeeRepository.findById(updatedEmployeeId).ifPresent(updatedEmployee -> {
                List<Employee> employeeList = project.getEmployeeList();
                employeeList.removeIf(employee -> employee.getId().equals(employeeId));
                employeeList.add(updatedEmployee);
                project.setEmployeeList(employeeList);
            });
            projectRepository.save(project);
        });
    }

    @Override
    public void deleteEmployeeFromProject(Integer projectId, Integer employeeId) {
        projectRepository.findById(projectId).ifPresent(project -> {
            List<Employee> employeeList = project.getEmployeeList();
            employeeList.removeIf(employee -> employee.getId().equals(employeeId));
            project.setEmployeeList(employeeList);
            projectRepository.save(project);
        });
    }
}
