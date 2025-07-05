package com.cognizant.orm_learn.spring_learn.service;

import com.cognizant.orm_learn.spring_learn.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllPermanentEmployees();
}
