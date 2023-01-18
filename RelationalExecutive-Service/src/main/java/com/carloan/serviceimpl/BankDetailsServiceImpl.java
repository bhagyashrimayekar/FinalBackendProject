package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.BankDetails;
import com.carloan.rpository.BankDetailsRepository;
import com.carloan.service.BankDetailsService;

@Service
public class BankDetailsServiceImpl implements BankDetailsService {

	@Autowired
	private BankDetailsRepository repo;
	
	@Override
	public BankDetails addBankDetails(BankDetails bankDetails) {
		return repo.save(bankDetails);
	}

	@Override
	public List<BankDetails> getBankDetails() {
	
		List<BankDetails> blist=repo.findAll();
		return blist;
	}

}
