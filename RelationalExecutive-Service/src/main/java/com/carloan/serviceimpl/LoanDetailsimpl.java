package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.carloan.model.LoanDetails;
import com.carloan.repository.LoanDetailsRepository;
import com.carloan.service.LoanDetailsService;

@Service
public class LoanDetailsimpl implements LoanDetailsService{
	
  @Autowired
	private LoanDetailsRepository repo;
	@Override
	public void addLoanDetail(LoanDetails lc) {

		repo.save(lc);
			
		}
	@Override
	public List<LoanDetails> getAllDetails() {
		List<LoanDetails>ldlist = repo.findAll();
		return ldlist;
	}
	@Override
	public List<LoanDetails> deleteById(int id) {
	repo.deleteById(id);
		return repo.findAll();
	}
		
	}


