package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

@RestController
//@Controller
@RequestMapping("employees")
public class HelloController {
	@GetMapping("abc/{name}")
//	@ResponseBody
	public String sayHello(@PathVariable String name) {
		return "Hello:"+name;
	}
	
	@Autowired
	private IEmployeeService service;
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return service.getAllEmployees();
		}
	
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}
	
	@GetMapping("/name/{name}")	
	public List<Employee> getEmployeeByName(@PathVariable String name){
		return service.getEmployeesByName(name);
	}
	
	@PostMapping
	public Employee createNewEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public Employee deleteEmployeee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp){
		return service.updateEmployee(emp);
	}
}
