package com.hexaware.springrestcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestcrud.entity.Employee;

@Repository   //optional
public interface EmployeeRepository  extends  JpaRepository<Employee,Integer> {

}
