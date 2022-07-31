package com.springboot.employeedata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//Test
public interface EmployeeDataRepository extends JpaRepository<EmployeeDataEntity, Integer>{

		public EmployeeDataEntity findByName(String name);
		
		@Query(value = "select id, name, salary, designation from employee order by salary desc, name asc", nativeQuery=true)
		public List<EmployeeDataEntity> findAllBySalary();
}
