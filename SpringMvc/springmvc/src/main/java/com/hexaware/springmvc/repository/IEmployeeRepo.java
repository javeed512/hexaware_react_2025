package com.hexaware.springmvc.repository;

import java.util.List;

import com.hexaware.springmvc.entity.Employee;

public interface IEmployeeRepo {
	
	public int  addEmployee(Employee emp);
	
	public List<Employee>  getAll();

}
