package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.WhiskyTrackerApplication;
import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;
    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/whiskys")
    public ResponseEntity<List<Whisky>> findWhikskyByYear(
            @RequestParam(name = "year", required = false) String year,
            @RequestParam(name = "age", required = false) String age,
            @RequestParam(name = "distillery", required = false) String distillery
            ){
        if (year != null){
            int cat = Integer.parseInt(year);
            return new ResponseEntity<>(whiskyRepository.getByYear(cat), HttpStatus.OK);
        }
        if (age != null && distillery != null) {
            int cat = Integer.parseInt(age);
            Distillery dist = distilleryRepository.getDistinctByName(distillery);
            return new ResponseEntity<>(whiskyRepository.getWhiskyByAgeAndDistillery(cat, dist), HttpStatus.OK);
        }
            return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
        }

}
