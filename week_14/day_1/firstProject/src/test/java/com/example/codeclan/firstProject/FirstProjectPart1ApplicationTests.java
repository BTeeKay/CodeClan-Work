package com.example.codeclan.firstProject;

import com.example.codeclan.firstProject.repositories.PirateRespository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstProjectPart1ApplicationTests {

	@Autowired
	PirateRespository pirateRespository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreatePirate() {
		Pirate jack = new Pirate("Jack", "Sparrow", 32);
		pirateRespository.save(jack);
	}

}
