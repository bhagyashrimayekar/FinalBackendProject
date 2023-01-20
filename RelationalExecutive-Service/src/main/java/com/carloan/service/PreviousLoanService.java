package com.carloan.service;

import org.springframework.web.bind.annotation.PostMapping;

import com.carloan.model.PreviousLoan;

public interface PreviousLoanService {

	public PreviousLoan addPrevLoanDetails(PreviousLoan pl);
	public PreviousLoan getPrevLoanDetails(int ploanId);

}
