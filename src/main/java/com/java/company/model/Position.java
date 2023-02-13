package com.java.company.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity(name = "positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "department_id")
    Long departmentId;

    String positionName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "position_id")
    private Set<Employee> employeeSet = new HashSet<>();

}
