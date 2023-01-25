package com.carloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.model.EnquiryDetails;
import com.carloan.service.EnquiryDetailsService;

@RestController
@RequestMapping("/enquiryDetails")
public class EnquiryDetailsController {
	@Autowired
	private EnquiryDetailsService service;

	@PostMapping("/registerEnquiry")
	public EnquiryDetails registerEnquiry(@RequestBody EnquiryDetails enquiryDetails) {
		return service.registerEnquiry(enquiryDetails);

	}

	@GetMapping("/getAllEnquiryData")
	public List<EnquiryDetails> getAllEnquiryData() {

		List<EnquiryDetails> el = service.getAllEnquiryData();
		return el;

	}

	@GetMapping("/findAllByCreatedDate/{createdDate}")
	public List<EnquiryDetails> findAllByCreatedDate(@PathVariable String createdDate) {
		List<EnquiryDetails> eList=service.findAllByCreatedDate(createdDate);
		return eList;
	}
	
	@GetMapping("/getenquirydetailsbyid/{eid}")
	public EnquiryDetails findbyid(@PathVariable int eid) {
		EnquiryDetails eList=service.getenquirydetailsbyid(eid);
		return eList;
	}
}
