package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PreviousLoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ploanId;
	private double ploanAmount;
	private int pTenure;
	private double paidAmount;
	private double remainningamount;
	private int deafaulterCount;
	@OneToOne
	private PreviousLoanBank previousloanbank;
	private String status;
	private String remark;
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
	public double getRemainningamount() {
		return remainningamount;
	}
	public void setRemainningamount(double remainningamount) {
		this.remainningamount = remainningamount;
	}
	public int getDeafaulterCount() {
		return deafaulterCount;
	}
	public void setDeafaulterCount(int deafaulterCount) {
		this.deafaulterCount = deafaulterCount;
	}
	public PreviousLoanBank getPreviousloanbank() {
		return previousloanbank;
	}
	public void setPreviousloanbank(PreviousLoanBank previousloanbank) {
		this.previousloanbank = previousloanbank;
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
