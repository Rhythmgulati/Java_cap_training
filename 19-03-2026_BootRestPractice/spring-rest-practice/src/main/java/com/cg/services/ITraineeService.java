package com.cg.services;

import java.util.List;

import com.cg.dto.TraineeDTO;

public interface ITraineeService {
	List<TraineeDTO> getAllTrainees();
	List<TraineeDTO> getTraineesByName(String name);
    TraineeDTO getTraineeById(int id);
    String deleteTraineeById(int id);
    TraineeDTO updateTrainee(TraineeDTO t);
    TraineeDTO addNewTrainee(TraineeDTO t);
	
	
}
