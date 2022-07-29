package com.springboot.employeedata;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDataImplementation implements EmployeeDataService {
	
	@Autowired
	private EmployeeDataRepository EmployeeDataRepository;
	
	@Override
	public String addEmployee(EmployeeDataEntity Employee) {
		EmployeeDataEntity clearEmpData = EmployeeDataRepository.findByName(Employee.getName());
		if (clearEmpData == null)
		{
			EmployeeDataRepository.save(Employee);
			return "New Employee Added to the Database";}
		else 
			throw new EmployeeDataAlreadyExistExp ("EmployeeData Already Existed in the Database");
	}

	@Override
	public EmployeeDataEntity updEmployee(EmployeeDataEntity Employee, int id)
	{
		Optional<EmployeeDataEntity> ed = EmployeeDataRepository.findById(id);
		EmployeeDataEntity eda = ed.get();
		eda.setName(Employee.getName());
		eda.setSalary(Employee.getSalary());
		eda.setDesignation(Employee.getDesignation());
		EmployeeDataRepository.save(eda);
		return eda;}
	
	@Override
	public List<EmployeeDataEntity> getEmployee(){
		return EmployeeDataRepository.findAllBySalary();}
}
