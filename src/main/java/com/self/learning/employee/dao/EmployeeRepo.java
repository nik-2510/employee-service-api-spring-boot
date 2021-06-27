package com.self.learning.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.self.learning.employee.model.Employee;
import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	public List<Employee> findByTechnologyIgnoreCase(String technology);
	
}
