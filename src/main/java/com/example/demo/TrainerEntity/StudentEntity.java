package com.example.demo.TrainerEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_list")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sid")
	private long sid;
	
	@Column(name="sname")
	private String sname;
	
	
	
	@Column (name="semail")
	private String semail;
	
	@Column (name="scontactno")
	private String scontactno;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getScontactno() {
		return scontactno;
	}

	public void setScontactno(String scontactno) {
		this.scontactno = scontactno;
	} 
	
	
	
	
	
	

}
