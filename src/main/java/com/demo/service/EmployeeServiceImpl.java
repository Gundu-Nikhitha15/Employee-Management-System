package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Dao.EmployeeDao;
import com.demo.model.Employee;

import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	
	@Override
	public Employee addEmployee(Employee emp)
	{
		return dao.save(emp);
	}

	@Override
	public Employee UpdateEmployee(Employee emp) {
		return dao.save(emp);
	}

	@Override
	public Employee getEmployee(int empid) {
		return dao.getById(empid);
	}

	@Override
	public String DeleteEmployee(int empid) {
		 dao.deleteById(empid);
		return "deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}

}
