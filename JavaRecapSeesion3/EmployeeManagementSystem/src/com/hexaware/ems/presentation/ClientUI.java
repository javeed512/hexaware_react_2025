package com.hexaware.ems.presentation;

import java.util.Scanner;

import com.hexaware.ems.pojo.Employee;
import com.hexaware.ems.service.EmployeeServiceImp;
import com.hexaware.ems.service.IEmployeeService;

public class ClientUI {

	public static void main(String[] args) {

	
		
	IEmployeeService service =	 new EmployeeServiceImp();

		boolean flag = true;
		
		Scanner  scanner = new Scanner(System.in);

		while (flag) {
			
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. DISPLAY ALL EMPLOYEES");
			System.out.println("3. EXIT");
			
			
		int choice =	  scanner.nextInt();

			switch (choice) {
			case 1:
				
				System.out.println("Enter EID");
				int eid =  scanner.nextInt();
				System.out.println("Enter ENAME");
				String ename = scanner.next();
				System.out.println("Enter SALARY");
				double salary = scanner.nextDouble();
				
				Employee emp = new Employee(eid, ename, salary);
				
				int count =	service.addEmployee(emp);
				
				if(count > 0) {
					
					System.out.println("Employee Record inserted successfully");
					
				}
				else {
					
					System.err.println("Insert fail..");
					
				}

				break;

			case 2:

						service.displayAllEmployees();
						
				break;
				
			case 3:
				
						flag = false;
						
						System.out.println("Thank you , Visit again..");

				break;

			default:
				break;
			}

		}

	}

}
