package com.andres.employeemanagementapi.repository;

import com.andres.employeemanagementapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}