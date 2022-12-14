package com.springboot.employeedata;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeDataEntity {
	
	@Id
	private int id;
	private String name;
	private int salary;
	private String designation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public EmployeeDataEntity(int id, String name, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	//Super class
	public EmployeeDataEntity() {
		super();}
}
