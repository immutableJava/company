package com.java.company.service;


import com.java.company.model.Department;

import java.util.Collection;

public interface DepartmentService {
    Collection<Department> findAllDepartments();

    Department addDepartment(Department department);

    Department updateDepartment(Department department);

    void deleteDepartmentById(Long id);

    Department findDepartmentById(Long id);
}
