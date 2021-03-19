package com.example.demo.TrainerServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.TrainerDto;
import com.example.demo.TrainerEntity.TrainerEntity;
import com.example.demo.TrainerRepository.TrainerRepositary;
import com.example.demo.TrainerServiceInterface.TrainerServiceInterface;
@Service
public class TrainerServiceImplementation implements TrainerServiceInterface {
	
	@Autowired
	TrainerRepositary repovar;
    
	@Override
	public TrainerEntity Trainer(TrainerDto dto) {
		TrainerEntity ent=new TrainerEntity();
		ent.setContactNo(dto.getContactNo());
		ent.setExperience(dto.getExperience());
		ent.setTname(dto.getTname());
		ent.setTemail(dto.getEmail());
		
		return repovar.save(ent);
	}
	

}
