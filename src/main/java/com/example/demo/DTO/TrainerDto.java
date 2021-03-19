package com.example.demo.DTO;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrainerDto {
	
	@NotNull(message = "tname not null")
	@JsonProperty(value ="tname")
	private String Tname;
	
	@NotNull(message = "experience not null")
	@JsonProperty(value ="experience")
	private int Experience;
	
	@NotNull(message = "email not null")
	@JsonProperty(value ="email")
	private String email;
	
	@NotNull(message = "contactNo not null")
	@JsonProperty(value ="contact")
	private Long contactNo;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		this.Experience = experience;
	}
	
	
	
	
	

}
