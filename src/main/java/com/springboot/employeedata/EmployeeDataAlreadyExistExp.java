package com.springboot.employeedata;

public class EmployeeDataAlreadyExistExp extends RuntimeException {
	private String msg;
	private String message = msg;
	
	public EmployeeDataAlreadyExistExp(String string) {
	}

}
