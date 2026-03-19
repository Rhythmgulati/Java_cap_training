package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeRepo eRepo;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return eRepo.findAll();

	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> op = eRepo.findById(id);
		if (op.isPresent()) {
			return op.get();
		} else {
			return null;
		}
	}

	@Override
	public List<Employee> getEmployeesByName(String s) {
		return eRepo.findByName(s);
	}
	
	@Override
	public Employee createEmployee(Employee emp) {
		return eRepo.saveAndFlush(emp);
	}

	@Override
	public Employee deleteEmployee(int id) {
		Optional<Employee> op = eRepo.findById(id);
		if (op.isPresent()) {
			eRepo.deleteById(id);
			return op.get();
		} else {
			return null;
		}
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println(e);
		System.out.println(getEmployee(e.getEmpid()));
		if(getEmployee(e.getEmpid())!=null) {
			return eRepo.saveAndFlush(e);
		}else {
			return null;
		}
	}
	
	
	
	

}
