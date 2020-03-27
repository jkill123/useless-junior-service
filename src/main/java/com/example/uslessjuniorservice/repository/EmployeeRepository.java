package com.example.uslessjuniorservice.repository;

import com.example.uslessjuniorservice.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 10:23
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
