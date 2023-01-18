package com.carloan.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.Enquiry;
import com.carloan.repo.Enquiry_JpaRepo;
import com.carloan.service_Interface.Enquiry_Interface;


@Service
public class Enquiry_ServiceImpl implements Enquiry_Interface{

	@Autowired
	private Enquiry_JpaRepo repo;

	@Override
	public Enquiry registerEnquiry(Enquiry enquiry) {
 return repo.save(enquiry);	
	}

	@Override
	public List<Enquiry> getAllEnquiryData() {
		List<Enquiry> enquiries=repo.findAll();
		
		return enquiries;
	}

	
	
	
}
