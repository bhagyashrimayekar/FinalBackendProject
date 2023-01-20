package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountDetails {

	@Id
	private long accountNO;
	private String accountype;
	private double accountBalance;
	private String accountHolderName;
	private String accountStatus;

	public String getAccountype() {
		return accountype;
	}

	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public long getAccountNO() {
		return accountNO;
	}

	public void setAccountNO(long accountNO) {
		this.accountNO = accountNO;
	}

}
