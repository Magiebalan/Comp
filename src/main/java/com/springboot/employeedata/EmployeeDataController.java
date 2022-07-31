package com.springboot.employeedata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDataController {

    @Autowired
    private EmployeeDataService service;
    
    @PostMapping("/Employee")
    public String addEmployee(@RequestBody EmployeeDataEntity Employee) {
        return service.addEmployee(Employee);}

    @PutMapping("/Employee/{id}/{salary}")
    public EmployeeDataEntity updEmployee(@PathVariable double salary, @PathVariable int id, @RequestBody EmployeeDataEntity Employee) {
        return service.updEmployee(Employee, id);
    }

    @GetMapping("/getEmployee")
    public List<EmployeeDataEntity> getAllEmployee(){
        return service.getEmployee();
    }
    
    @ExceptionHandler(value = EmployeeDataAlreadyExistExp.class)
	public ResponseEntity EmployeeDataAlreadyExistExp(
			EmployeeDataAlreadyExistExp EmployeeDataAlreadyExistExp) {
		return new ResponseEntity("Employee already exists!", HttpStatus.CONFLICT);

    }
}
