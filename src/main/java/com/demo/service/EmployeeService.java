package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee emp);

	Employee UpdateEmployee(Employee emp);

	Employee getEmployee(int empid);

	String DeleteEmployee(int empid);


	List<Employee> getAllEmployees();
}
