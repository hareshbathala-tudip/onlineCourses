package com.example.demo.TrainerEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainer_list")
public class TrainerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="tid")
	private long Tid;
	@Column(name="tname")
	private String Tname;
	@Column(name="experience")
	private int Experience;
	@Column (name="tcontact_no")
	private Long ContactNo;
	@Column (name="temail")
	private String Temail;
	
	
	
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	
	public Long getContactNo() {
		return ContactNo;
	}
	public void setContactNo(Long contactNo) {
		ContactNo = contactNo;
	}
	public String getTemail() {
		return Temail;
	}
	public void setTemail(String temail) {
		Temail = temail;
	}
	public long getTid() {
		return Tid;
	}
	public void setTid(long tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	

}
