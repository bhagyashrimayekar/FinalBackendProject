package com.carloan.communication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.carloan.model.EnquiryDetails;


@FeignClient(name="relationalexecutive")
public interface REToOEEnquiry {

	@GetMapping("enquiryDetails/getenquirydetailsbyid/{eid}")
	public EnquiryDetails getEnquiryDetailsById(@PathVariable int eid);
		
	
}
