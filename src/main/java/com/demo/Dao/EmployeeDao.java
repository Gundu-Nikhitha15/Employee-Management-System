
 package com.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

//	Employee addEmployee(Employee emp);
//
//	Employee UpdateEmployee(Employee emp);
//
//	Employee getEmployee(int empid);
//
//	String DeleteEmployee(int empid);
//
//	List<Employee> getAllEmployees();
}
