package com.hexaware.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springmvc.entity.Employee;
import com.hexaware.springmvc.service.IEmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/web")
public class EmployeeController {
	
	
		@Autowired
		IEmployeeService service;
	
	
			@RequestMapping(value="/hello",method = RequestMethod.GET)
			@ResponseBody
			public String hello() {
				
				return "Hello friends";
				
			}
	
			
			@RequestMapping(value="/add", method = RequestMethod.POST)
			
			public  String  addEmp(@ModelAttribute  Employee employee , HttpSession session) {
				
						session.setAttribute("emp", employee);
				
			    service.addEmployee(employee);
						
					
				
						return  "success";  // success is a view or page name  
											// path is  /views/success.jsp
						
			}
			
			@RequestMapping(value="/getall", method=RequestMethod.GET)
			public  String   getAllEmployees(HttpSession session){
				
				
				List<Employee>  empList =	service.getAll();
				
					session.setAttribute("empList", empList);
						
				
				return "display";    // display.jsp
				
			}
			
			
			
			
			
			
			
			
			
}
