package com.self.learning.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private Long id;
	private String name;
	private String email;
	private int age;
	private String technology;
	
	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Employee() {
		
	}
	
	public Employee(Long id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", technology="
				+ technology + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
