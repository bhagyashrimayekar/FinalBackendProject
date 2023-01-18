package com.carloan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	private String bankName;
	private String branchName;
	private long branchCode;
	private String branchType;
	private String ifsc;
	private String micr;
	private String email;
	private String status;
	private long contactNo;

	@OneToOne(cascade = CascadeType.ALL)
	private BranchAddress bAddress;
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(long branchCode) {
		this.branchCode = branchCode;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getMicr() {
		return micr;
	}

	public void setMicr(String micr) {
		this.micr = micr;
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

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public BranchAddress getbAddress() {
		return bAddress;
	}

	public void setbAddress(BranchAddress bAddress) {
		this.bAddress = bAddress;
	}
}
