package com.cg.dto;

import com.cg.entity.Trainee;

public class EntityMapper {
	public static TraineeDTO convertEntityToDto(Trainee t) {
		return new TraineeDTO(t.getTraineeId(), t.getTraineeName(), t.getTraineeDomain() , t.getTraineeLocation());
	}
	public static Trainee convertDtoToEntity(TraineeDTO t) {
		return new Trainee(t.getTraineeName(), t.getTraineeDomain(), t.getTraineeLocation());
	}
}
