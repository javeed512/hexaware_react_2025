package com.hexaware.ems.service;

import java.util.List;

import com.hexaware.ems.pojo.Employee;

public interface IEmployeeService {
	
	
		public int  addEmployee(Employee emp);
		
		public   List<Employee>    displayAllEmployees();
	

}
