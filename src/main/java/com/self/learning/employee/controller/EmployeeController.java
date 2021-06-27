package com.self.learning.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.self.learning.employee.model.Employee;
import com.self.learning.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping(path = "api/v1/employee")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@GetMapping(path = "api/v1/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") Long id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping(path = "api/v1/employee/technology/{technology}")
	public List<Employee> getEmployeesByTechnology(@PathVariable("technology") String technology) {
		return employeeService.getEmployeesByTechnology(technology);
	}

	@PostMapping(path = "api/v1/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@DeleteMapping(path = "api/v1/employee/{id}")
	public void deleteEmployeeById(@PathVariable("id") Long id) {
		 employeeService.deleteEmployeeById(id);
	}
	
	@PutMapping(path = "api/v1/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
}
