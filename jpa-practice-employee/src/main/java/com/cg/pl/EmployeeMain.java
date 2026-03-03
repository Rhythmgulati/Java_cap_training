package com.cg.pl;

import java.lang.foreign.AddressLayout;
import java.util.List;
import java.util.Scanner;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		IEmployeeService es = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n===== Employee Management Menu =====");
			System.out.println("1. Create Employee");
			System.out.println("2. Find Employee By Id");
			System.out.println("3. Get All Employees");
			System.out.println("4. Update Employee Name");
			System.out.println("5. Remove Employee");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {

			case 1:
				System.out.print("Enter Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Email: ");
				String email = sc.nextLine();

				System.out.print("Enter DOB (yyyy-mm-dd): ");
				String dob = sc.nextLine();

				String result = es.createEmployee(new Employee(name, email, dob));
				System.out.println(result);
				break;

			case 2:
				System.out.print("Enter Employee Id: ");
				String id = sc.nextLine();
				Employee emp = es.findById(id);
				System.out.println(emp);
				break;

			case 3:
				List<Employee> employees = es.getAllEmployee();
				System.out.println(employees);
				break;

			case 4:
				System.out.print("Enter Employee Id: ");
				String updateId = sc.nextLine();

				System.out.println("You can just skip by pressing enter if you dont want to update any field");

				System.out.print("Enter New Name: ");
				String newName = sc.nextLine();

				System.out.println("Enter updated email: ");
				String newEmail = sc.nextLine();

				System.out.print("Enter DOB (yyyy-mm-dd): ");
				String newDob = sc.nextLine();

				System.out.println(es.updateEmployeeName(updateId, newName, newEmail, newDob));
				break;

			case 5:
				System.out.print("Enter Employee Id: ");
				String removeId = sc.nextLine();
				System.out.println(es.removeEmployee(removeId));
				break;

			case 0:
				System.out.println("Exiting... Thank You!");
				break;

			default:
				System.out.println("Invalid Choice!");
			}

		} while (choice != 0);

		sc.close();
	}

}
