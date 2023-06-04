package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		var employee = new Employee();
//		employee.setFirstName("barcsa");
//		employee.setLastName("gergo");
//		employee.setEmailId("barcsa@gmail.com");
//		employeeRepository.save(employee);
//
//		var employee2 = new Employee();
//		employee2.setFirstName("barcsa");
//		employee2.setLastName("gergo");
//		employee2.setEmailId("barcsa@gmail.com");
//		employeeRepository.save(employee2);
	}
}
