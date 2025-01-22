package com.turkcell.spring.starter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="employees")
@Entity
public class Employee extends User{
    private String employeeNumber;
}
