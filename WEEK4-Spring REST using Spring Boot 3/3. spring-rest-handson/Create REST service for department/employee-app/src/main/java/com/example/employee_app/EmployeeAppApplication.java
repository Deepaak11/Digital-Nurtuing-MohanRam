package com.example.employee_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employee.xml")
public class EmployeeAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppApplication.class, args);
		System.out.println("Application Started...");
	}
}
