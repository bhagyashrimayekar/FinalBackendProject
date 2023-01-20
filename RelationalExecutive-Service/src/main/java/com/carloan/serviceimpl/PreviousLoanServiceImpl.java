package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.PreviousLoan;
import com.carloan.rpository.PreviousLoanRepository;
import com.carloan.service.PreviousLoanService;

@Service
public class PreviousLoanServiceImpl implements PreviousLoanService {
	@Autowired
	private PreviousLoanRepository repo;

	@Override
	public PreviousLoan addPrevLoanDetails(PreviousLoan pl) {
	
		return repo.save(pl);
	}

	@Override
	public PreviousLoan getPrevLoanDetails(int ploanId) {
		
		return repo.findByPloanId(ploanId);
	}

	@Override
	public List<PreviousLoan> getallpreviousloandetails() {
		
		return repo.findAll();
	}

	@Override
	public List<PreviousLoan> deletebyid(int ploanId) {
		repo.deleteById(ploanId);
		return repo.findAll();
		
	}

	

}
