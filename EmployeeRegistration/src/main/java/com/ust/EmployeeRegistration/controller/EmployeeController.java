package com.ust.EmployeeRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ust.EmployeeRegistration.model.Employee;
import com.ust.EmployeeRegistration.repository.EmployeeRepository;
import com.ust.EmployeeRegistration.service.EmployeeService;

@Controller
@RequestMapping("api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path = "register", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody Employee addEmployee(Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping(path = "ust/employees")
	public @ResponseBody List<Employee> getAllEmployees(){
		return employeeService.getEmployees();
	}
	
	@GetMapping(path = "ust/employee/{id}")
	public @ResponseBody Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping(path = "ust/employee")
	public @ResponseBody Employee updateEmployee(@RequestBody Employee employee) {
		System.out.println("Updating employee..");
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping(path = "ust/employee/{id}")
	public Employee deleteEmployeeById(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
}
