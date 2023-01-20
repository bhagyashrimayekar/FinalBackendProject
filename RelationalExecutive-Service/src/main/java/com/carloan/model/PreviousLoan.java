package com.carloan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class PreviousLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int ploanId;		
	 private Double ploanAmount;	
	 private int pTenure;		
	 private Double paidAmount;	
	 private Double remainingAmount;		
	 private int deafulterCount;
	 @OneToOne(cascade = CascadeType.ALL)
	 private PreviousLoanBank pbankDetails;	
	 private String status;	
	 private String remark;
	public int getPloanId() {
		return ploanId;
	}
	public void setPloanId(int ploanId) {
		this.ploanId = ploanId;
	}
	public Double getPloanAmount() {
		return ploanAmount;
	}
	public void setPloanAmount(Double ploanAmount) {
		this.ploanAmount = ploanAmount;
	}
	public int getpTenure() {
		return pTenure;
	}
	public void setpTenure(int pTenure) {
		this.pTenure = pTenure;
	}
	public Double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public Double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(Double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public int getDeafulterCount() {
		return deafulterCount;
	}
	public void setDeafulterCount(int deafulterCount) {
		this.deafulterCount = deafulterCount;
	}
	public PreviousLoanBank getPbankDetails() {
		return pbankDetails;
	}
	public void setPbankDetails(PreviousLoanBank pbankDetails) {
		this.pbankDetails = pbankDetails;
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
