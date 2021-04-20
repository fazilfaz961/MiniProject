package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class MiniprojectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MiniprojectApplication.class, args);
	}
	@Autowired
    private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("Fazil","R","fazil@atos.net"));
		this.employeeRepository.save(new Employee("Vijay","J","vijay@atos.net"));
		this.employeeRepository.save(new Employee("Hari","G","hari@atos.net"));
		this.employeeRepository.save(new Employee("Nivetha","Kumar","Nivetha@atos.net"));
	}

}
