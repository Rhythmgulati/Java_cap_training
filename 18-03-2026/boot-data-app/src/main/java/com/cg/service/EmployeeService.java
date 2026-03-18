package com.cg.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import ch.qos.logback.core.model.conditional.ElseModel;

@Service
public class EmployeeService {
	@Autowired
	private IEmployeeRepo erepo;

	public String createEmployee(Employee e) {
		Employee emp = erepo.saveAndFlush(e);
		return "Employee created with id" + emp.getEmpid() + "";
	}

	public List<Employee> getAllEmployee() {
		return erepo.findAll();
	}

	public Employee getEmployee(int id) {
		Optional<Employee> op = erepo.findById(id);
		if (op.isPresent()) {
			return op.get();
		} else {
			return null;
		}
	}

	public String removeEmployee(int id) {
		if (getEmployee(id) != null) {
			erepo.deleteById(id);
			return "employeeDELETED";
		}else {
			return "Employee not found";
		}
	}
	
	public String UpdateEmployee(Employee e) {
		erepo.saveAndFlush(e);
		return "Employee Updated";
	}
	
	public List<Employee> getByName(String s) {
		System.out.println("finding");
		System.out.println(erepo.findByNameLike(s));
		 return erepo.findByNameLike(s);
	}
	
	
	public List<Employee> getEmployeeSalaryGreaterThan(int n){
		return erepo.findBySalaryGreaterThan(n);
	}
	
	public List<Employee> getByDobRange(LocalDate a,LocalDate b){
		return erepo.findByDobBetween(a, b);
	}
}
