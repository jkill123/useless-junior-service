package com.example.uslessjuniorservice.services;

import com.example.uslessjuniorservice.domain.Employee;
import com.example.uslessjuniorservice.model.EmployeeDto;
import com.example.uslessjuniorservice.service.employee.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 14:02
 */
@ExtendWith(MockitoExtension.class)
public class EmployerServiceTest {

    @Mock
    private EmployeeService employeeService;

    @Test
    void shouldGetEmployees(){
        Employee employee = new Employee();
        employee.setName("TestEmpl");
        employee.setAge(11);
        employee.setSurName("TestSur");
        employee.setDescription("TestDescr");
        employee.setPosition("TestPos");
        Optional<List<Employee>> list = Optional.of(new ArrayList<>());
        list.get().add(employee);

        when(employeeService.getEmployees()).thenReturn(list);

        Optional<List<Employee>> employees = employeeService.getEmployees();
        Assertions.assertNotNull(employee);
        Assertions.assertTrue(employees.get().contains(employee));
    }

    @Test
    void shouldGetEmployeeById(){
        Integer id = 322;
        Employee employee = new Employee();
        employee.setName("TestEmpl");
        employee.setAge(11);
        employee.setSurName("TestSur");
        employee.setDescription("TestDescr");
        employee.setPosition("TestPos");
        Optional<Employee> optionalEmployee = Optional.of(employee);

        when(employeeService.getEmployeeById(id)).thenReturn(optionalEmployee);

        Optional<Employee> optional = employeeService.getEmployeeById(id);
        Assertions.assertNotNull(employee);
        Assertions.assertEquals(optional, optionalEmployee);
    }

    @Test
    void shouldAddNewEmployee(){
        EmployeeDto employeeDto = new EmployeeDto();

        employeeService.saveNewEmployee(employeeDto);
        verify(employeeService, times(1)).saveNewEmployee(employeeDto);
    }

    @Test
    void shouldUpdateEmployee(){
        Integer id = 322;
        EmployeeDto employeeDto = new EmployeeDto();

        employeeService.updateEmployee(id,employeeDto);
        verify(employeeService, times(1)).updateEmployee(id,employeeDto);
    }

    @Test
    void shouldDeleteEmployee(){
        Integer id = 322;

        employeeService.deleteEmployeeById(id);
        verify(employeeService, times(1)).deleteEmployeeById(id);
    }
}
