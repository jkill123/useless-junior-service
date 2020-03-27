package com.example.uslessjuniorservice.domain;

import com.example.uslessjuniorservice.model.EmployeeDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 10:09
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surName;
    private String description;
    private String position;
    private Integer age;

    public Employee(EmployeeDto employeeDto){
        this.name = employeeDto.getName();
        this.surName = employeeDto.getSurName();
        this.description = employeeDto.getDescription();
        this.position = employeeDto.getPosition();
        this.age = employeeDto.getAge();
    }
}
