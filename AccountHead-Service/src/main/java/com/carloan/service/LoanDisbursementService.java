package com.carloan.service;

import java.util.List;


import com.carloan.model.LoanDisbursement;

public interface LoanDisbursementService {
	
public LoanDisbursement addLoanDisbursementData(LoanDisbursement l);
public List<LoanDisbursement>getAllDetails();
public List<LoanDisbursement>deleteById(int id);
public List<LoanDisbursement>updateLoanDisbursement();
}
