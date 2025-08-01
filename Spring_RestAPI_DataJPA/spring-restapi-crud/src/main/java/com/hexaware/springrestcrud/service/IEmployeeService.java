package com.hexaware.springrestcrud.service;

import java.util.List;

import com.hexaware.springrestcrud.entity.Employee;

public interface IEmployeeService {

	
			public  Employee   addEmployee(Employee emp);
			public  Employee   updateEmployee(Employee emp);
			
			
			
			public Employee   getByEid(int eid);
			public  String    deleteByEid(int eid);
			
			public   List<Employee>      getAllEmployees();
	
}
