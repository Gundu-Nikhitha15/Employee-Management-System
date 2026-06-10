package com.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin

public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
	@PostMapping("/insert")  // http://localhost:7846/employee/insert //POST:
	public Employee addEmployee ( @RequestBody Employee emp) 
	{
		
		return service.addEmployee(emp);
	}

	
	@PutMapping("/update")  // http://localhost:7845/employee/update //PUT::
	public Employee updateEmployee (@RequestBody Employee emp) {
		
		return service.UpdateEmployee(emp);

	}
	
	@GetMapping("/get/{id}")  
	//	http://localhost:7845/employee/get/id
	public Employee getEmployee ( @PathVariable ("id") int empid) {
		return service.getEmployee(empid);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String DeleteMapping(@PathVariable("id") int empid)
	{
		return service.DeleteEmployee(empid);
	}

	
	@GetMapping("/getall") 
	public List<Employee> getAllEmployees(){
    return  service.getAllEmployees();
		
	}
}
