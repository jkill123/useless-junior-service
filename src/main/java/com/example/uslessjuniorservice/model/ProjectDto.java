package com.example.uslessjuniorservice.model;

import com.example.uslessjuniorservice.domain.Employee;
import com.example.uslessjuniorservice.domain.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 11:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDto {
    private Integer id;
    private String title;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String type;
    private String description;
    private List<Employee> employeeList;

    public ProjectDto(Project project){
        this.id = project.getId();
        this.title = project.getTitle();
        this.dateFrom = project.getDateFrom();
        this.dateTo = project.getDateTo();
        this.type = project.getType();
        this.description = project.getDescription();
        this.employeeList = project.getEmployeeList();
    }
}
