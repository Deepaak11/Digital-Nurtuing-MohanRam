package com.example.employee_app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.example.employee")
@EnableTransactionManagement
public class EmployeeAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppApplication.class, args);
	}
}
