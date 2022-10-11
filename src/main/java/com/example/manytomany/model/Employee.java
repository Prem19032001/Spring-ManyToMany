package com.example.manytomany.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private Set<Department> department;
}

