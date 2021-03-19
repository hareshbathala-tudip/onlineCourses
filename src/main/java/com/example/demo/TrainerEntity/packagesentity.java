package com.example.demo.TrainerEntity;

import java.math.BigDecimal;

public class packagesentity {
	private int pid;
	private String package_description;
	private BigDecimal package_price;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPackage_description() {
		return package_description;
	}
	public void setPackage_description(String package_description) {
		this.package_description = package_description;
	}
	public BigDecimal getPackage_price() {
		return package_price;
	}
	public void setPackage_price(BigDecimal package_price) {
		this.package_price = package_price;
	}
	

}
