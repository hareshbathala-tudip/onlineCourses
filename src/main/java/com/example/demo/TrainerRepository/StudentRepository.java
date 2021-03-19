package com.example.demo.TrainerRepository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.TrainerEntity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity,Long>{
	
	@Transactional
	@Modifying
	@Query(value="delete from student_list where sid =:sid",nativeQuery=true)
	public void deleteStudent(@Param(value="sid") int sid);
	
	@Transactional
	@Modifying
	@Query(value="update student_list SET sname=:sname WHERE sid=:sid",nativeQuery=true)
	public void updateStudent(@Param(value="sname") String sname,@Param(value="sid") int sid);

}


