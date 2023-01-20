package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	private int loanNo;
	private EMIDetails emideatils;
	private double loanAmount;
	private int rateOfInterest;
	private int tenure;
	private double totalAmountToBePaid;
	private int processingFees;
	private double totalInterest;
	private String sanctionDate;
	private String remark;
	private String status;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public EMIDetails getEmideatils() {
		return emideatils;
	}
	public void setEmideatils(EMIDetails emideatils) {
		this.emideatils = emideatils;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getTotalAmountToBePaid() {
		return totalAmountToBePaid;
	}
	public void setTotalAmountToBePaid(double totalAmountToBePaid) {
		this.totalAmountToBePaid = totalAmountToBePaid;
	}
	public int getProcessingFees() {
		return processingFees;
	}
	public void setProcessingFees(int processingFees) {
		this.processingFees = processingFees;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
	public String getSanctionDate() {
		return sanctionDate;
	}
	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
