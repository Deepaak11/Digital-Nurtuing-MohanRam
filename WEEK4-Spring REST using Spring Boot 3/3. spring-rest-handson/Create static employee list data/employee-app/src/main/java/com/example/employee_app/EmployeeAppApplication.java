package com.example.employee_app;

import com.example.employee_app.dao.EmployeeDao;
import com.example.employee_app.model.Employee;

import java.util.List;


public class EmployeeAppApplication {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		List<Employee> employees = dao.getAllEmployees();
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}
