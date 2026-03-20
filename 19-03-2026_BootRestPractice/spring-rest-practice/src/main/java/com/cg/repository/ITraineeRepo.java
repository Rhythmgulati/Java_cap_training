package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cg.entity.Trainee;

public interface ITraineeRepo extends JpaRepository<Trainee, Integer>{
	List<Trainee> findByTraineeName(String s);
}