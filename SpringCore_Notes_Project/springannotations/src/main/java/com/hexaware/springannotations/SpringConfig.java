package com.hexaware.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScans(value = {@ComponentScan(basePackages = "com.hexaware.springannotations.*")})
public class SpringConfig {
	
	
		@Scope("prototype")
		@Bean("b1")
		public  Thread  getThreadObj() {
			
			System.out.println("I am getThreadObj() called by IOC");
			
			
			return new Thread();
			
		}
	
	

}
