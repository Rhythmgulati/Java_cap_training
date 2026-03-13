package com.bg.beans;

public class Employee {
	private int empid;
	private String name;
	private Address address;
	
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
