package com.example.codeclan.firstProject.controllers;

import com.example.codeclan.firstProject.Pirate;
import com.example.codeclan.firstProject.repositories.PirateRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PirateController {

    @Autowired
    PirateRespository pirateRespository;

    @GetMapping(value="/pirates")
    public List<Pirate> getAllPirates(){
        return pirateRespository.findAll();
    }

    @GetMapping(value="pirates/{id}")
    public Optional<Pirate> getPirateID(@PathVariable Long id) {
        return pirateRespository.findById(id);
    }
}
