package com.example.codeclan.demo;

import com.example.codeclan.demo.repositories.PirateRepository;
import com.example.codeclan.demo.repositories.RaidRepository;
import com.example.codeclan.demo.repositories.ShipRepository;
import org.assertj.core.error.ShouldBeInThePast;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstSpringProjectApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateSinglePirateAndShipAndRaid(){
		Ship ship = new Ship("The Bloody Awful");
		shipRepository.save(ship);

		Pirate jack = new Pirate("Jack", "Sparrow",25,ship);
		pirateRepository.save(jack);

		Raid raid = new Raid("Harry Potter's Gaff", 999);
		raidRepository.save(raid);

		raid.addPirate(jack);
		raidRepository.save(raid);
	}

}
