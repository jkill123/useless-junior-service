package com.example.uslessjuniorservice.domain;

import com.example.uslessjuniorservice.model.ProjectDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 10:13
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Project {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String type;
    private String description;
    @OneToMany
    private List<Employee> employeeList;

    public Project(ProjectDto projectDto){
        this.title = projectDto.getTitle();
        this.dateFrom = projectDto.getDateFrom();
        this.dateTo = projectDto.getDateTo();
        this.type = projectDto.getType();
        this.description = projectDto.getDescription();
        this.employeeList = projectDto.getEmployeeList();
    }
}
