package com.hexaware.springrestcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestcrud.entity.Employee;
import com.hexaware.springrestcrud.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	@Autowired
	IEmployeeService service;
	
				@PostMapping("/insert")
				public  Employee    addEmp(@RequestBody Employee emp) {
					
					  return service.addEmployee(emp);
					
				}
	
				
				@PutMapping("/update")
				public  Employee    updateEmp(@RequestBody Employee emp) {
					
					  return service.updateEmployee(emp);
					
				}
	
				@GetMapping("/getbyid/{eid}")
				public   Employee  getById(@PathVariable  int eid) {
					
					
					return  service.getByEid(eid);
					
				}
				
				@GetMapping("/getall")
				public  List<Employee>  getAll(){
					
					
					return service.getAllEmployees();
					
				}
				
				
				@DeleteMapping("/deletebyid/{eid}")
				public String   deleteById(@PathVariable int eid) {
					
					
					return service.deleteByEid(eid);
					
				}
				
				
				
	

}
