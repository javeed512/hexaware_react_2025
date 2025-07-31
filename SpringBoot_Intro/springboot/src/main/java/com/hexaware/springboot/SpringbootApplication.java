package com.hexaware.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.hexaware.springboot.entity.Employee;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(SpringbootApplication.class, args);
	
			Employee emp =	context.getBean(Employee.class);
			
				System.out.println(emp);
	
	}
	
	
	@Bean
	public  String  getObj() {
		
		return new String("hello");
		
	}
	

}
