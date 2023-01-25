package com.carloan.communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.carloan.model.EnquiryDetails;

@FeignClient(name="operationalexecutive")
public interface OEToCMEnquiry {
	
	
	
	@GetMapping("customerverification/getenquirydetailsbyid/{eid}")
	public EnquiryDetails getEnquiryDetails(@PathVariable int eid);


}