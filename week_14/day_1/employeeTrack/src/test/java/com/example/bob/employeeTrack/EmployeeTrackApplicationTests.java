package com.example.bob.employeeTrack;

import com.example.bob.employeeTrack.respositories.EmployeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackApplicationTests {

	@Autowired
	EmployeRepository employeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmploye() {
		Employe bob = new Employe("Bob", "Kerr", 30);
		employeRepository.save(bob);
	}

}
