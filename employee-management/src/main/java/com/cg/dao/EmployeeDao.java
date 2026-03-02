package com.cg.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;

public class EmployeeDao implements IEmployeeDao {
	private static Connection con;
	static {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "tiger");
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String saveEmployee(Employee emp) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into employees values(?,?,?,?)");
			ps.setString(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getDob());
			int rows = ps.executeUpdate();
			if (rows > 0)
				return "Employee Created";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Employee Not Created";
	}

	@Override
	public Employee findEmployee(String empid) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from employees where emp_id=?");
			ps.setString(1, empid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1));
				Employee e = new Employee(rs.getString(2), rs.getString(3), rs.getString(4));
				return e;
			}
			} catch (SQLException e) {
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
			PreparedStatement ps = con.prepareStatement("select * from employees");
		    ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				li.add(new Employee(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			return li;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String updateEmployeeName(String empid, String newName) {
		try {
			PreparedStatement ps = con.prepareStatement("update employees set name=? where emp_id=?");
			ps.setString(1, newName);
			ps.setString(2, empid);
			int rows = ps.executeUpdate();
			if(rows>0) {
				return rows+"rows updated";
			}else {
				return "Employee not found";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public String deleteEmployee(String empid) {
		// TODO Auto-generated method stub
		try {
//		PreparedStatement ps = con.prepareStatement("Delete from employees where emp_id=?");
		CallableStatement cl = con.prepareCall("{call del_emp(?)}");
			cl.setString(1, empid);
			int rows = cl.executeUpdate();
			if(rows>0) {
				return rows+" rows updated";
			}else {
				return "Not found";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
