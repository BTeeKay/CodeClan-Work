package com.example.bob.employeeTrack.controllers;

import com.example.bob.employeeTrack.Employe;
import com.example.bob.employeeTrack.respositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeController {

    @Autowired
    EmployeRepository employeRepository;

    @GetMapping(value="/employe")
    public List<Employe> getAllEmployees() {
        return employeRepository.findAll();
    }

    @GetMapping(value="/employe/{id}")
    public Optional<Employe> getEmploye(@PathVariable Long id) {
        return employeRepository.findById(id);
    }
}
