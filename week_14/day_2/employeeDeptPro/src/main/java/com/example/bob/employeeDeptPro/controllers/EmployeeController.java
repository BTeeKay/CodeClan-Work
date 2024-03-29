package com.example.bob.employeeDeptPro.controllers;

import com.example.bob.employeeDeptPro.Employee;
import com.example.bob.employeeDeptPro.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value="/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
