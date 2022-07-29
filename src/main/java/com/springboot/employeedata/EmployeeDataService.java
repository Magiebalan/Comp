package com.springboot.employeedata;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeDataService {
	
	public String addEmployee(EmployeeDataEntity Employee) throws EmployeeDataAlreadyExistExp;
	
	public List<EmployeeDataEntity> getEmployee();
	
	public EmployeeDataEntity updEmployee(EmployeeDataEntity Employee, int id) ;
}
