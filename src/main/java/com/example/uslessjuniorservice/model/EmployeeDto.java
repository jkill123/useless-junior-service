package com.example.uslessjuniorservice.model;

import com.example.uslessjuniorservice.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 11:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {
    private Integer id;
    private String name;
    private String surName;
    private String description;
    private String position;
    private Integer age;

    public EmployeeDto(Employee employee){
        this.id = employee.getId();
        this.name = employee.getName();
        this.surName = employee.getSurName();
        this.description = employee.getDescription();
        this.position = employee.getPosition();
        this.age = employee.getAge();
    }
}
