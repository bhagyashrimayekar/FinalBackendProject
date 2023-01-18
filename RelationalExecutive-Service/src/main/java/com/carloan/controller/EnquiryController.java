package com.carloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.model.Enquiry;
import com.carloan.service_Interface.Enquiry_Interface;

@RestController
@RequestMapping("/enquiry")
public class EnquiryController {
	
	@Autowired
	private Enquiry_Interface serv;
	
	@PostMapping("/registerEnquiry")
	public Enquiry registerEnquiry(@RequestBody Enquiry enquiry) {
		serv. registerEnquiry(enquiry);
		
		return enquiry;
			
	}

	@GetMapping("/getAllEnquiryData")
	public List<Enquiry>  getAllEnquiryData(){
		List<Enquiry> enquirylist=serv.getAllEnquiryData();
		
		return enquirylist;
		
	}
}
