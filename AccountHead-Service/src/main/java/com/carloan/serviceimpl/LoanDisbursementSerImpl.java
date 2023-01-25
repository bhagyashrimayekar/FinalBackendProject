package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.LoanDisbursement;
import com.carloan.repository.LoanDisbursementRepository;
import com.carloan.service.LoanDisbursementService;
@Service

public class LoanDisbursementSerImpl implements LoanDisbursementService {

	@Autowired
	private LoanDisbursementRepository repo;
	@Override
	public LoanDisbursement addLoanDisbursementData(LoanDisbursement l) {
       return repo.save(l);
		
	}
	@Override
	public List<LoanDisbursement> getAllDetails() {
		List<LoanDisbursement> ldlist = repo.findAll();
		return ldlist;
	}
	@Override
	public List<LoanDisbursement> deleteById(int id) {
			repo.deleteById(id);
		return repo.findAll();
	}
	@Override
	public List<LoanDisbursement> updateLoanDisbursement() {
		List<LoanDisbursement> ldlist =repo.findAll();
		return ldlist;
		
	}

}
