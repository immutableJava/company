package com.java.company.service;

import com.java.company.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Collection<Employee> findAllEmployees();
    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);

}
