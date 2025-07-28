package com.hexaware.springannotations.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hexaware.springannotations.beans.Employee;

@Repository
public class EmployeeDaoImp  implements IEmployeeDao {
	
	@Autowired
	Employee emp;
	
	
	@Autowired
    Thread  t1;
	

	@Override
	public void show() {


			System.out.println("show() called from Repository/DAO");
			
			System.out.println("Employee obj in dao "+emp);
			
			System.out.println("Thread obj "+t1);
		
	}

}
