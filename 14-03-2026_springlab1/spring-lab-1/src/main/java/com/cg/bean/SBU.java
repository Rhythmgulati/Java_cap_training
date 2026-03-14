package com.cg.bean;

import java.util.List;

public class SBU {
	private int sbId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	
	public int getSbId() {
		return sbId;
	}
	public void setSbId(int sbId) {
		this.sbId = sbId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
	
}
