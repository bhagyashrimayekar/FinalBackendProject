package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.Cibil;
import com.carloan.repository.CibilRepository;
import com.carloan.service.CibilService;

@Service
public class CibilServiceImpl implements CibilService  {

	@Autowired
	private CibilRepository repo;
	
	@Override
	public Cibil addcibildetails(Cibil c) {
		
		return repo.save(c);
	}

	@Override
	public List<Cibil> deletecibilbyid(int cibilId) {
		
		 repo.deleteById(cibilId);
		 return repo.findAll();	}

	@Override
	public List<Cibil> getallcibildetails() {
		
		return repo.findAll();
	}

	@Override
	public Cibil getcibildetailbyid(int cibilId) {
	
		return repo.findById(cibilId).get();
	}

}
