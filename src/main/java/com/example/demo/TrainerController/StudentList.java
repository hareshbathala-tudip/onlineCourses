package com.example.demo.TrainerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.StudentDto;
import com.example.demo.TrainerEntity.StudentEntity;
import com.example.demo.TrainerServiceInterface.StudentService;


@RestController
public class StudentList {
	
	@Autowired
	StudentService var;
	
	
	@PostMapping(value="/student")
	public StudentEntity studentRegistration(@RequestBody StudentDto dto1)
	{
		return var.studentRegistration(dto1);
		
	}
	@DeleteMapping(value="/studentDelete")
	public String studentDelete(@RequestParam int sid)
	{
		return var.studentDelete(sid);
		
	}
	
	@PutMapping(value="/studentUpdate")
	public String studentUpdate(@RequestParam int sid,@RequestParam String sname)
	{
		return var.studentUpdate(sid, sname);
		
	}

}
