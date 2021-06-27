package com.self.learning.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.learning.employee.dao.*;
import com.self.learning.employee.model.Employee;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO ;

	public List<Employee> getEmployees() {
		return employeeDAO.getAllEmployees();
	}
	
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeDAO.getEmployeeByID(id);
	}
	
	public List<Employee> getEmployeesByTechnology(String technology) {
		return employeeDAO.getEmployeesByTechnology(technology);
	}
	
	public Employee addEmployee(Employee employee) {
		return employeeDAO.addEmployee(employee); 
	}
	
	public void deleteEmployeeById(Long id) {
		employeeDAO.deleteEmployee(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee); 
	}
}
