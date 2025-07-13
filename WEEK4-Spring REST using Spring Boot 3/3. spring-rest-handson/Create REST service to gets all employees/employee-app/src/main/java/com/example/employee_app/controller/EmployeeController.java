package com.example.employee_app.controller;

import com.example.employee_app.model.Employee;
import com.example.employee_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        System.out.println("GET /employees hit");
        return employeeService.getAllEmployees();
    }
}
