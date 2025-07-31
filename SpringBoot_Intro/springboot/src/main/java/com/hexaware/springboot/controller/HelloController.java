package com.hexaware.springboot.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/demo")
public class HelloController {
	
			@RequestMapping(value="/hello",method=RequestMethod.GET)
			@ResponseBody
			public String   sayHello(HttpServletRequest request , HttpServletResponse response , HttpSession session) {
				
				int eid = Integer.parseInt(request.getParameter("eid"));
				String ename =  	request.getParameter("ename");
				double salary = Double.parseDouble(request.getParameter("salary"));
				
				Employee emp = new Employee(eid, ename, salary);
				
				
				return  "<h1>"+ emp +"</h1>";
				
			}
	
			@RequestMapping(value = "/add" , method = RequestMethod.POST)
			@ResponseBody
			public  String    addEmp(@ModelAttribute  Employee emp , HttpSession session) {
				
						session.setAttribute("e1", emp);
				
				return "Employee Details "+emp;
				
			}
			
			

}
