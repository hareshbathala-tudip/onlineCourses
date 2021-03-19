package com.example.demo.TrainerServiceInterface;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.DTO.TrainerDto;
import com.example.demo.TrainerEntity.TrainerEntity;



public interface TrainerServiceInterface {
	
	public TrainerEntity Trainer(@RequestBody TrainerDto dto);

}
