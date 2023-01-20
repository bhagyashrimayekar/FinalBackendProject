package com.carloan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class PreviousLoanBank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	private String branchName;		
	private double branchCode;		
			
	private String branchType;		
	private String ifscCode;
	private String micrCode;	
	private Double conatctNO;
	@OneToOne(cascade = CascadeType.ALL)
	private BranchAddress branchAddress;		
	private String email;		
	private String status;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public double getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(double branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getMicrCode() {
		return micrCode;
	}
	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}
	public Double getConatctNO() {
		return conatctNO;
	}
	public void setConatctNO(Double conatctNO) {
		this.conatctNO = conatctNO;
	}
	public BranchAddress getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(BranchAddress branchAddress) {
		this.branchAddress = branchAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
