package com.example.bob.employeeDeptPro;

import com.example.bob.employeeDeptPro.repositories.EmployeeRepository;
import com.example.bob.employeeDeptPro.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDeptProApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddEmployee() {
		Employee employee1 = new Employee("Brian", "Kerr");
		employeeRepository.save(employee1);
	}

	@Test
	public void canAddProject() {
		Project project1 = new Project("Kiss Ken", 55);
		projectRepository.save(project1);
	}

}
