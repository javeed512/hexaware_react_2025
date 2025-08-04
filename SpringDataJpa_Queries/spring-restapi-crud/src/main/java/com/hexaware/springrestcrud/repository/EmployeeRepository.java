package com.hexaware.springrestcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestcrud.entity.Employee;

@Repository   //optional
public interface EmployeeRepository  extends  JpaRepository<Employee,Integer> {

	// select * from Emp_table  where  ename = ?;
			List<Employee> 	findByEname(String ename);
			
			//select * from Emp_table  where salary > ?;
		List<Employee>	  findBySalaryGreaterThan(double salary);
		
		
		// JPQL
		
		@Query("select  e  from Employee  e  where  e.salary > ?1 order by e.ename")
		 List<Employee>   findBySalaryOrderByEname(double salary);
	
}
