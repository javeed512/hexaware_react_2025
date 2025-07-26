package com.hexaware.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.hexaware.springcore.beans.Employee;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScans(value = {@ComponentScan(basePackages = "com.hexaware.springcore.beans")})
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context =  new AnnotationConfigApplicationContext(App.class);
    	
    	
    		Employee emp =	context.getBean(Employee.class);
    		
    		System.out.println(emp);
    	
    			emp.setEid(101);
    			emp.setEname("king");
    			emp.setSalary(40000);
    			
    			System.out.println(emp.getEid() +" "+emp.getEname() +" "+emp.getSalary());
    			
    			
    			Employee e1 =	(Employee)	context.getBean("e1");
    			
    					System.out.println(e1);
    				
    		
    }
}
