package com.example.uslessjuniorservice.service.employee;

import com.example.uslessjuniorservice.domain.Employee;
import com.example.uslessjuniorservice.model.EmployeeDto;

import java.util.List;
import java.util.Optional;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 11:20
 */
public interface EmployeeService {
    Optional<Employee> getEmployeeById(Integer employeeId);
    Optional<List<Employee>> getEmployees();
    void saveNewEmployee(EmployeeDto employeeDto);
    void updateEmployee(Integer employeeId, EmployeeDto employeeDto);
    void deleteEmployeeById(Integer employeeId);
}
