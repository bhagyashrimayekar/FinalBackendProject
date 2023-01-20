package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PreviousLoanBank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ploanId;	
	private double ploanAmount;		
	private int pTenure;		
	private double paidAmount;		
	private double remainingAmount;		
	private int deafulterCount;		
	private String status;		
	private String remark;
	@OneToOne
	private PreviousLoanDetails pbankDetails;

	public PreviousLoanDetails getPbankDetails() {
		return pbankDetails;
	}
	public void setPbankDetails(PreviousLoanDetails pbankDetails) {
		this.pbankDetails = pbankDetails;
	}
	public int getPloanId() {
		return ploanId;
	}
	public void setPloanId(int ploanId) {
		this.ploanId = ploanId;
	}
	public double getPloanAmount() {
		return ploanAmount;
	}
	public void setPloanAmount(double ploanAmount) {
		this.ploanAmount = ploanAmount;
	}
	public int getpTenure() {
		return pTenure;
	}
	public void setpTenure(int pTenure) {
		this.pTenure = pTenure;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public int getDeafulterCount() {
		return deafulterCount;
	}
	public void setDeafulterCount(int deafulterCount) {
		this.deafulterCount = deafulterCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	               		
	
			


}
