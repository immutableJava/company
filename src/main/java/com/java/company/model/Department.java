package com.java.company.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity(name = "departments")
public class Department {

    @Id
    @GeneratedValue
    private Long id;

    private String departmentName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    Set<Position> positionSet = new HashSet<>();

}
