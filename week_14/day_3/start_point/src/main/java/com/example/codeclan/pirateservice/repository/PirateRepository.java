package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

    List<Pirate> findByAgeGreaterThan(int age);

    List<Pirate> findPiratesByAge(int age);

    List<Pirate> findByRaidsId(Long id);

//    List<Pirate> findPiratesByName(String name);
//
//    Pirate findDistinctPiratesByName(String name);
}
