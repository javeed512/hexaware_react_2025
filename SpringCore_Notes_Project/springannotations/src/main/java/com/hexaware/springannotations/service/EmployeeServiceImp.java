package com.hexaware.springannotations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springannotations.beans.Employee;
import com.hexaware.springannotations.dao.IEmployeeDao;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	
	@Autowired
	IEmployeeDao dao ;
	
	@Autowired
	Employee emp;

	@Override
	public void service() {
		
			System.out.println(dao);
		 
		dao.show();
		
			System.out.println(emp);

	}

}
