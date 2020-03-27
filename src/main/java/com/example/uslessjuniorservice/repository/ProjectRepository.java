package com.example.uslessjuniorservice.repository;

import com.example.uslessjuniorservice.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 11:02
 */
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
