package com.ust.EmployeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.EmployeeRegistration.model.Employee;
import com.ust.EmployeeRegistration.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public Employee updateEmployee(Employee empl) {
		Employee employee = new Employee();
		Optional<Employee> updateEmployee = employeeRepository.findById(empl.getEmpId());
		if(updateEmployee.isPresent()) {
			System.out.println("employee found...");
			employee.setEmpId(empl.getEmpId());
			employee.setEmpName(empl.getEmpName());
			employee.setEmailId(empl.getEmailId());
			employee.setDomain(empl.getDomain());
			employee.setLocation(empl.getLocation());
			employee.setExperience(empl.getExperience());
			employeeRepository.save(employee);
		}
		else {
			return new Employee();
		}
		return employee;
	}

	public Employee deleteEmployee(int id) {
//		String message =
//		employeeRepository.deleteById(null);
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			
//		}
		return null;
	}
	
}
