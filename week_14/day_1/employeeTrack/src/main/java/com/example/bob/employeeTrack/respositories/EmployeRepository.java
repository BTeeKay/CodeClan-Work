package com.example.bob.employeeTrack.respositories;

import com.example.bob.employeeTrack.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
