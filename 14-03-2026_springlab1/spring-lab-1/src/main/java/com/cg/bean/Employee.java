package com.cg.bean;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private SBU businessUnit;
	private int age;
	
	
	
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getname() {
		return name;
	}



	public void setname(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}





	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public SBU getBusinessUnit() {
		return businessUnit;
	}



	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getDetails() {
		return "Employee Details--------------\n empId=" + empId + "\n employeeName=" + name + "\n salary=" + salary  + "\n age=" + age + "";
	}
	public String getSBUDetails() {
		return "SBU Details--------------\n"+getBusinessUnit().getSbId()+" \n"+getBusinessUnit().getSbuName()+"\n \n"+getBusinessUnit().getEmpList();
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + 
				 ", age=" + age + "]";
	}
	
	
	
	
}
