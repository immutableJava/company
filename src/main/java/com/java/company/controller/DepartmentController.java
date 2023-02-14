package com.java.company.controller;

import com.java.company.model.Department;
import com.java.company.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @PostMapping("/create")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        return ResponseEntity.ok(departmentService.addDepartment(department));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.findDepartmentById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Department> updateDepartment(@RequestBody Department employee) {
        return ResponseEntity.ok(departmentService.updateDepartment(employee));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Department> deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartmentById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Collection<Department>> getAllDepartments() {
        return ResponseEntity.ok(departmentService.findAllDepartments());
    }
}
