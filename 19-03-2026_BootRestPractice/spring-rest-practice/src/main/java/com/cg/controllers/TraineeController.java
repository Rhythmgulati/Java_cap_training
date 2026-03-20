package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.TraineeDTO;
import com.cg.services.ITraineeService;

@RestController
@RequestMapping("trainee")
public class TraineeController {

	@Autowired
	private ITraineeService tService;

	@PostMapping("create")
	public TraineeDTO addTrainee(@RequestBody TraineeDTO t) {
		return tService.addNewTrainee(t);
	}

	@GetMapping("getAll")
	public List<TraineeDTO> getAllTrainees() {
		return tService.getAllTrainees();
	}
	
	@GetMapping("/getByName/{name}")
	public List<TraineeDTO> getByName(@PathVariable String n){
		return tService.getTraineesByName(n);
	}

	@GetMapping("/get/{id}")
	public TraineeDTO getTraineeById(@PathVariable int id) {
		return tService.getTraineeById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteTrainee(@PathVariable int id) {
		return tService.deleteTraineeById(id);
	}

	@PutMapping("/update")
	public TraineeDTO updateTrainee(TraineeDTO t) {
		return tService.updateTrainee(t);
	}
	

}
