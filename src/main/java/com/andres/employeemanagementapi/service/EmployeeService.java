package com.andres.employeemanagementapi.service;

import com.andres.employeemanagementapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);
}