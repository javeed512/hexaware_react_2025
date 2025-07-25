package com.hexaware.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.hexaware.ems.pojo.Employee;

public class EmployeeDaoImp implements IEmployeeDao {
	
	
		Connection conn =	 DBUtil.getDBConnection();

	@Override
	public int addEmployee(Employee emp) {

		
			int count =0;
			
		try {
			PreparedStatement pstmt =		conn.prepareStatement("insert into  EmployeeInfo  values(?,?,?)");
			
							pstmt.setInt(1, emp.getEid());
							pstmt.setString(2, emp.getEname());
							pstmt.setDouble(3, emp.getSalary());
			
			
				count =		pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ? positional parameters
		
		
		return  count;
	}

	@Override
	public List<Employee> displayAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
