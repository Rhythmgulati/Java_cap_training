package com.cg.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByNameLike(String s);
	List<Employee> findBySalaryGreaterThan(int i);
	List<Employee> findByDobBetween(LocalDate a,LocalDate b);
}