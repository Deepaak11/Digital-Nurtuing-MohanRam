package com.example.employee_app.dao;


import com.example.employee_app.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeDao {
    public static ArrayList<Employee> EMPLOYEE_LIST;

    @SuppressWarnings("unchecked")
    public EmployeeDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        EMPLOYEE_LIST = (ArrayList<Employee>) context.getBean("employeeList");
    }

    public ArrayList<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}

