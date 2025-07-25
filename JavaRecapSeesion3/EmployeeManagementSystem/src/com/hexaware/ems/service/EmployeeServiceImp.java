package com.hexaware.ems.service;

import java.util.List;

import com.hexaware.ems.dao.EmployeeDaoImp;
import com.hexaware.ems.dao.IEmployeeDao;
import com.hexaware.ems.pojo.Employee;

public class EmployeeServiceImp  implements IEmployeeService {
	
	
	
	IEmployeeDao dao = new EmployeeDaoImp();
	

	@Override
	public int addEmployee(Employee emp) {
		
		return  dao.addEmployee(emp);
	}

	@Override
	public List<Employee> displayAllEmployees() {
		
		return  dao.displayAllEmployees();
	}

}
