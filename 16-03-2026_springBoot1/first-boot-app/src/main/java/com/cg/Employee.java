package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empid;
	@Value("${empname}")
	private String name;
	
	@Autowired
	private Address address;
	
	
//    public Employee(  Address address) {
//		
//		this.empid = empid;
//		this.name = name;
//		this.address = address;
//	}


	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String employeeDetails() {
		return "Employee [empid=" + empid + ", name=" + name + ", city=" + address.getCity()+"]";
	}
	
	
	
}
