package com.example.demo.TrainerServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DTO.StudentDto;
import com.example.demo.TrainerEntity.StudentEntity;
import com.example.demo.TrainerRepository.StudentRepository;
import com.example.demo.TrainerServiceInterface.StudentService;


@Service
public class StudentServiceImplementation implements StudentService {
	
	@Autowired
	StudentRepository variable;
	


	@Override
	public StudentEntity studentRegistration(StudentDto dto1) {
		StudentEntity ent=new StudentEntity();
		ent.setSname(dto1.getSname());
		ent.setScontactno(dto1.getScontactNo());
		ent.setSemail(dto1.getSemail());
		return variable.save(ent);
		
	}



	



	@Override
	public String studentDelete(int sid) {
		variable.deleteStudent(sid);
		
		return "sucess";
	}



	@Override
	public String studentUpdate(int sid, String sname) {
		variable.updateStudent(sname, sid);
		return "sucess";
	}
	
	
	

}
