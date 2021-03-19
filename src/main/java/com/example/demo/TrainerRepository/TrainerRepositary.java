package com.example.demo.TrainerRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.TrainerEntity.TrainerEntity;


@Repository
public interface TrainerRepositary extends CrudRepository<TrainerEntity,Long>{
	

}
