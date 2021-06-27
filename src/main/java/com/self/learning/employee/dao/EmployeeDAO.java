package com.self.learning.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.self.learning.employee.model.Employee;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDAO {

	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}
	
	public Optional<Employee> getEmployeeByID(Long id) {
		return employeeRepo.findById(id);
	}
	
	public List<Employee> getEmployeesByTechnology(String technology) {
		return employeeRepo.findByTechnologyIgnoreCase(technology);
	}
	
	public Employee addEmployee(Employee employee) {
		 employeeRepo.save(employee);
		 return employee;
	}
	
	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		 employeeRepo.save(employee);
		 return employee;
	}

}
