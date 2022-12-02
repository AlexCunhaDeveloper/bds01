package com.devsuperior.bds01.repositories;

import com.devsuperior.bds01.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Department, Long> {

}
