package com.example.codeclan.firstProject.repositories;

import com.example.codeclan.firstProject.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRespository extends JpaRepository<Pirate, Long> {


}
