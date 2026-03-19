package com.cg.service;

import java.util.List;

import com.cg.entity.Employee;

public interface IEmployeeService {
	List<Employee> getAllEmployees();

	Employee getEmployee(int id);
	
	List<Employee> getEmployeesByName(String s);
	
	Employee createEmployee(Employee emp); 
	
	Employee deleteEmployee(int id);
	
	Employee updateEmployee(Employee emp);
}
