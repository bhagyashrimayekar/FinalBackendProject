package com.carloan.service;

import java.util.List;

import com.carloan.model.BankDetails;

public interface BankDetailsService {

	public BankDetails addBankDetails(BankDetails bankDetails);
	
	public List<BankDetails> getBankDetails();
}
