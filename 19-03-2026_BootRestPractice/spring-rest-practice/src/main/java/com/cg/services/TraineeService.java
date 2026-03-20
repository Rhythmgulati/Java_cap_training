package com.cg.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.EntityMapper;
import com.cg.dto.TraineeDTO;

import com.cg.entity.Trainee;
import com.cg.repository.ITraineeRepo;


@Service
public class TraineeService implements ITraineeService {

	@Autowired
	private ITraineeRepo tRepo;

	@Override
	public List<TraineeDTO> getAllTrainees() {
		// TODO Auto-generated method stub
		List<Trainee> li = tRepo.findAll();
		List<TraineeDTO> res = new ArrayList<TraineeDTO>();
		for (Trainee t : li) {
			res.add(EntityMapper.convertEntityToDto(t));
		}
		return res;
	}

	@Override
	public List<TraineeDTO> getTraineesByName(String name) {
		// TODO Auto-generated method stub
		List<Trainee> li = tRepo.findByTraineeName(name);
		List<TraineeDTO> res = new ArrayList<TraineeDTO>();
		for (Trainee t : li) {
			res.add(EntityMapper.convertEntityToDto(t));
		}
		return res;
	}

	@Override
	public TraineeDTO getTraineeById(int id) {
		// TODO Auto-generated method stub
		Optional<Trainee> op = tRepo.findById(id);
		if (op.isPresent()) {
			return EntityMapper.convertEntityToDto(op.get());
		} else {
			return null;
		}
	}

	@Override
	public String deleteTraineeById(int id) {
		System.out.println(id);
		Optional<Trainee> op = tRepo.findById(id);
		System.out.println(op);
		if (op.isPresent()) {
			 tRepo.deleteById(id);
			 return "Trainee deleted";
			 
		} else {
			return "No Trainee with id: "+id+" found";
		}
	}

	@Override
	public TraineeDTO updateTrainee(TraineeDTO t) {
		System.out.println(getTraineeById(t.getTraineeId()));
		if (getTraineeById(t.getTraineeId()) != null) {
			
			return EntityMapper.convertEntityToDto(tRepo.saveAndFlush(EntityMapper.convertDtoToEntity(t)));
		} else {
			return null;
		}
	}

	@Override
	public TraineeDTO addNewTrainee(TraineeDTO t) {
		// TODO Auto-generated method stub
		return EntityMapper.convertEntityToDto(tRepo.saveAndFlush(EntityMapper.convertDtoToEntity(t)));
	}

}
