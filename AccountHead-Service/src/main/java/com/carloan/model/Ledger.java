package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ledger {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ledgerId;
	private String ledgerCreateDate;
	private double totalLoanAmount;
	private double payableAmountWithInterest;
	private int tenure;
	private double monthlyEMI;
	private double amountPaidTillDate;
	private double remainingAmount;
	private String nextEmiDateStart;
	private String nextEmiDateEnd;
	private int defaulterCount;
	private String EmiStatus;
    private String currentMonthEmiStatus;
    private String loanEndDate;
    private String loanStatus;
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public String getLedgerCreateDate() {
		return ledgerCreateDate;
	}
	public void setLedgerCreateDate(String ledgerCreateDate) {
		this.ledgerCreateDate = ledgerCreateDate;
	}
	public double getTotalLoanAmount() {
		return totalLoanAmount;
	}
	public void setTotalLoanAmount(double totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}
	public double getPayableAmountWithInterest() {
		return payableAmountWithInterest;
	}
	public void setPayableAmountWithInterest(double payableAmountWithInterest) {
		this.payableAmountWithInterest = payableAmountWithInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getMonthlyEMI() {
		return monthlyEMI;
	}
	public void setMonthlyEMI(double monthlyEMI) {
		this.monthlyEMI = monthlyEMI;
	}
	public double getAmountPaidTillDate() {
		return amountPaidTillDate;
	}
	public void setAmountPaidTillDate(double amountPaidTillDate) {
		this.amountPaidTillDate = amountPaidTillDate;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public String getNextEmiDateStart() {
		return nextEmiDateStart;
	}
	public void setNextEmiDateStart(String nextEmiDateStart) {
		this.nextEmiDateStart = nextEmiDateStart;
	}
	public String getNextEmiDateEnd() {
		return nextEmiDateEnd;
	}
	public void setNextEmiDateEnd(String nextEmiDateEnd) {
		this.nextEmiDateEnd = nextEmiDateEnd;
	}
	public int getDefaulterCount() {
		return defaulterCount;
	}
	public void setDefaulterCount(int defaulterCount) {
		this.defaulterCount = defaulterCount;
	}
	public String getEmiStatus() {
		return EmiStatus;
	}
	public void setEmiStatus(String emiStatus) {
		EmiStatus = emiStatus;
	}
	public String getCurrentMonthEmiStatus() {
		return currentMonthEmiStatus;
	}
	public void setCurrentMonthEmiStatus(String currentMonthEmiStatus) {
		this.currentMonthEmiStatus = currentMonthEmiStatus;
	}
	public String getLoanEndDate() {
		return loanEndDate;
	}
	public void setLoanEndDate(String loanEndDate) {
		this.loanEndDate = loanEndDate;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
    
}
