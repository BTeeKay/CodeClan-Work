package com.example.codeclan.demo.repositories;

import com.example.codeclan.demo.Pirate;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

}
