package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.CustomLog;

@Entity
public class CustomerProfession {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String ptype;
	private double psalary;
	private String psalaryType;
	private String pworkingperiod;
	private String pDesignation;
	
	@OneToOne
	public CustomerDetails customerDetails;
	
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public double getPsalary() {
		return psalary;
	}
	public void setPsalary(double psalary) {
		this.psalary = psalary;
	}
	public String getPsalaryType() {
		return psalaryType;
	}
	public void setPsalaryType(String psalaryType) {
		this.psalaryType = psalaryType;
	}
	public String getPworkingperiod() {
		return pworkingperiod;
	}
	public void setPworkingperiod(String pworkingperiod) {
		this.pworkingperiod = pworkingperiod;
	}
	public String getpDesignation() {
		return pDesignation;
	}
	public void setpDesignation(String pDesignation) {
		this.pDesignation = pDesignation;
	}
	

}
