package com.cognizant.orm_learn;



import com.cognizant.orm_learn.model.Department;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.model.Skill;
import com.cognizant.orm_learn.repository.DepartmentRepository;
import com.cognizant.orm_learn.repository.EmployeeRepository;
import com.cognizant.orm_learn.repository.SkillRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Bean
	public CommandLineRunner testPayrollData(EmployeeRepository employeeRepository,
											 DepartmentRepository departmentRepository,
											 SkillRepository skillRepository) {
		return args -> {
			System.out.println("=== All Employees ===");
			List<Employee> employees = employeeRepository.findAll();
			for (Employee e : employees) {
				System.out.println(e);
				System.out.println("Department: " + e.getDepartment());
				System.out.println("Skills:");
				e.getSkillList().forEach(skill -> System.out.println("- " + skill.getName()));
				System.out.println("--------------------");
			}

			System.out.println("\n=== All Departments ===");
			List<Department> departments = departmentRepository.findAll();
			for (Department d : departments) {
				System.out.println(d);
				if (d.getEmployeeList() != null) {
					d.getEmployeeList().forEach(emp -> System.out.println("-> " + emp.getName()));
				}
				System.out.println("--------------------");
			}

			System.out.println("\n=== All Skills ===");
			List<Skill> skills = skillRepository.findAll();
			for (Skill s : skills) {
				System.out.println(s);
				if (s.getEmployeeList() != null) {
					s.getEmployeeList().forEach(emp -> System.out.println("-> " + emp.getName()));
				}
				System.out.println("--------------------");
			}
		};
	}
}

