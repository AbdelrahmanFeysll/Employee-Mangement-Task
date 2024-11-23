package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import java.util.List;
import java.util.UUID;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee updateEmployee(UUID id, Employee employee);
    void deleteEmployee(UUID id);
    Employee getEmployeeById(UUID id);
    List<Employee> getAllEmployees();
}
