package com.carloan.service;

import java.util.List;

import com.carloan.model.EnquiryDetails;

public interface EnquiryDetailsService {

	public EnquiryDetails registerEnquiry(EnquiryDetails enquiryDetails);

	public List<EnquiryDetails> getAllEnquiryData();
	
	public List<EnquiryDetails> findAllByCreatedDate(String createdDate);
    
	public EnquiryDetails getenquirydetailsbyid(int eid);
}
