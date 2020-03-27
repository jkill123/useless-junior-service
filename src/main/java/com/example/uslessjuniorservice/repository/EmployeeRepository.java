package com.example.uslessjuniorservice.repository;

import com.example.uslessjuniorservice.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 10:23
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
