package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.SanctionLetter;
import com.carloan.repository.SanctionLetterRepository;
import com.carloan.service.SanctionLetterService;


@Service
public class SanctionLetterServiceImpl implements SanctionLetterService{
	@Autowired
	private SanctionLetterRepository repo;

	@Override
	public SanctionLetter addsanctionletterdetails(SanctionLetter sl) {
		
		return repo.save(sl);
	}

	@Override
	public List<SanctionLetter> deletesanctionletterdetailsbyid(int sId) {
	
		 repo.deleteById(sId);
		return repo.findAll();
	}

	@Override
	public SanctionLetter getsanctionletterdetailsbyid(int sId) {
		
		return repo.findById(sId).get();
	}

	@Override
	public List<SanctionLetter> getallsanctionletterdetails() {

		return repo.findAll();
	}
	

	


}
