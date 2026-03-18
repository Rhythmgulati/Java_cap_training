package com.cg;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;

@SpringBootApplication
public class BootDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootDataAppApplication.class, args);
		EmployeeService employeeSer = ctx.getBean(EmployeeService.class);

//	        employeeSer.createEmployee(new Employee("Rg",LocalDate.of(2003, 03, 20),2000000));

//	        List<Employee> li=employeeSer.getAllEmployee();
//	        for(Employee e:li) {
//	        	System.out.println(e);
//	        }

//	        System.out.println(employeeSer.getEmployee(2)); 

//	        List<Employee> li = employeeSer.getByName("%rag%");
//	        
//	        
//	        
//	        for(Employee e:li) {
//	        	System.out.println(e);
//	        }
//	        

//		List<Employee> li = employeeSer.getEmployeeSalaryGreaterThan(1000000);

//		for (Employee e : li) {
//			System.out.println(e);
//		}
		
//		List<Employee> li = employeeSer.getByDobRange(LocalDate.of(2004, 01, 01),LocalDate.of(2004, 12, 31));
//
//		for (Employee e : li) {
//			System.out.println(e);
//		}
		

	}

}
