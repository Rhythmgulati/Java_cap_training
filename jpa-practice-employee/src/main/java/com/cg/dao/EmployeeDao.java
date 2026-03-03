package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao implements IEmployeeDao {
	private static EntityManager eManager;
	private static EntityTransaction tx;
	static {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
			eManager = emf.createEntityManager();
			tx = eManager.getTransaction();
			System.out.println("Connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String saveEmployee(Employee emp) {
		try {
			tx.begin();
			eManager.persist(emp);
			tx.commit();
			return "Employee created succesfully";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Employee Not Created";
	}

	@Override
	public Employee findEmployee(String empid) {
		try {
			tx.begin();
			Employee emp = eManager.find(Employee.class, empid);
			tx.commit();
			return emp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		List<Employee> li = new ArrayList<>();
		try {
			List<Employee> list = eManager.createQuery("from Employee").getResultList();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String updateEmployeeName(String empid, Employee emp) {
		try {
			tx.begin();
			Employee employee = eManager.find(Employee.class, empid);
			
			if(employee!=null) {
			if(emp.getName()!=null) {
				employee.setName(emp.getName());	
			}
			if(emp.getEmail()!=null) {
				employee.setEmail(emp.getEmail());
			}
			if(emp.getDob()!=null) {
				employee.setDob(emp.getDob());
			}
			
			tx.commit();
			return "Fields updated employee with id"+empid;
			}else {
				return "No employee with id "+empid+" found";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public String deleteEmployee(String empid) {
		// TODO Auto-generated method stub
		try {
			tx.begin();
			Employee employee = eManager.find(Employee.class, empid);
			if(employee!=null) {
			eManager.remove(employee);
			tx.commit();
			return "Employee deleted: having id"+empid;
			}else {
				return "No employee with id "+empid+" found";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
