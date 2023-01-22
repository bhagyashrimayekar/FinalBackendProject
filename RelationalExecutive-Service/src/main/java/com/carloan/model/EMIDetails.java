package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EMIDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emiID;
	private double emiAmountMonthly;
	private String nextEmiDueDate;
	private String previousEmiStatus;
	public int getEmiID() {
		return emiID;
	}
	public void setEmiID(int emiID) {
		this.emiID = emiID;
	}
	public double getEmiAmountMonthly() {
		return emiAmountMonthly;
	}
	public void setEmiAmountMonthly(double emiAmountMonthly) {
		this.emiAmountMonthly = emiAmountMonthly;
	}
	public String getNextEmiDueDate() {
		return nextEmiDueDate;
	}
	public void setNextEmiDueDate(String nextEmiDueDate) {
		this.nextEmiDueDate = nextEmiDueDate;
	}
	public String getPreviousEmiStatus() {
		return previousEmiStatus;
	}
	public void setPreviousEmiStatus(String previousEmiStatus) {
		this.previousEmiStatus = previousEmiStatus;
	}
	
}
