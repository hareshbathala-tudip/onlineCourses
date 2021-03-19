package com.example.demo.TrainerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.TrainerDto;
import com.example.demo.TrainerEntity.TrainerEntity;
import com.example.demo.TrainerServiceInterface.TrainerServiceInterface;

@RestController
public class TrainerList {
	
	@Autowired
	TrainerServiceInterface variable;
	
	@PostMapping(value="/trainer")
	public TrainerEntity Trainer( @RequestBody TrainerDto dto)
	{
		return variable.Trainer(dto); 
		
	}
	
	
	
	
}
