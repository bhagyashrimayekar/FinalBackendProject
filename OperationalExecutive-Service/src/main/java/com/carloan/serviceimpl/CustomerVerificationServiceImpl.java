package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.CustomerVerification;
import com.carloan.repository.CustomerVerificationRepository;
import com.carloan.service.CustomerVerificationService;

@Service
public class CustomerVerificationServiceImpl implements CustomerVerificationService{

	@Autowired
	private CustomerVerificationRepository repo;
	
	
	@Override
	public CustomerVerification addcustomerverificationdetails(CustomerVerification cv) {
		
		return repo.save(cv);
	}

	@Override
	public List<CustomerVerification> deletecustomerverificationdetailsbyid(int verificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerVerification> getallcustomerverificationdetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerVerification getcustomerverificationdetailsbyid(int verificationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
