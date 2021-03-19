package com.example.demo.TrainerServiceInterface;

import com.example.demo.DTO.StudentDto;
import com.example.demo.TrainerEntity.StudentEntity;


public interface StudentService {
	public StudentEntity studentRegistration(StudentDto dto1);
	
	public String studentDelete(int sid);
	
	public String studentUpdate(int sid,String sname);
	
	

}
