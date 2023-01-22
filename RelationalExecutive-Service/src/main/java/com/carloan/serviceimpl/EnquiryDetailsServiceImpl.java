package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.EnquiryDetails;
import com.carloan.repository.EnquiryDetailsRepository;
import com.carloan.service.EnquiryDetailsService;

@Service
public class EnquiryDetailsServiceImpl implements EnquiryDetailsService{
	
	@Autowired
	private EnquiryDetailsRepository repo;

	@Override
	public EnquiryDetails registerEnquiry(EnquiryDetails enquiryDetails) {
		return repo.save(enquiryDetails);
	}

	@Override
	public List<EnquiryDetails> getAllEnquiryData() {
		List<EnquiryDetails> el=repo.findAll();
		return el;
	}

	@Override
	public List<EnquiryDetails> findAllByCreatedDate(String createdDate) {
		List<EnquiryDetails> eList=repo.findAllByCreatedDate(createdDate);
		return eList;
	}
	

}
