package com.carloan.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.carloan.model.LoanDetails;

public interface LoanDetailsService {
	public void addLoanDetail(@RequestBody LoanDetails lc);
	public List<LoanDetails>getAllDetails();
	public List<LoanDetails>deleteById(int id);
}
