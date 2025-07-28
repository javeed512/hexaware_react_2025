package com.hexaware.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springannotations.service.EmployeeServiceImp;
import com.hexaware.springannotations.service.IEmployeeService;

/**
 * Spring Main class
 *
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		/*
		 * Employee emp = context.getBean(Employee.class);
		 * 
		 * System.out.println(emp);
		 * 
		 * Employee e1 = context.getBean("e1", Employee.class);
		 * 
		 * System.out.println(e1);
		 */

		IEmployeeService s1 = context.getBean(EmployeeServiceImp.class);
		
				System.out.println(s1);
		
				s1.service();
		
				
		Thread  t  = (Thread)		   context.getBean("b1");
		
			System.out.println(t);

	}

}
