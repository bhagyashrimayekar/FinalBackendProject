package com.carloan.service;

import java.util.List;

import com.carloan.model.CustomerVerification;


public interface CustomerVerificationService {
	
public CustomerVerification addcustomerverificationdetails(CustomerVerification cv);
	
	public List<CustomerVerification> deletecustomerverificationdetailsbyid(int verificationId);
	
	public List<CustomerVerification> getallcustomerverificationdetails();
	
	public CustomerVerification getcustomerverificationdetailsbyid(int verificationId);
	

}
