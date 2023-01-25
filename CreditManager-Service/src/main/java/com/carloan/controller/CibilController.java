package com.carloan.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.communication.OEToCMEnquiry;
import com.carloan.model.Cibil;
import com.carloan.model.EnquiryDetails;
import com.carloan.service.CibilService;

@RestController
@RequestMapping("/cibil")

public class CibilController {

	@Autowired
	private CibilService ser;
	
	@Autowired
	private OEToCMEnquiry otce;
	
		

	@PostMapping("/addcibildetails")
	public ResponseEntity<String> addcibildetails(@RequestBody Cibil c) {
		 Random r=new Random();
		 int y=r.nextInt(900);
		 c.setCibilScore(y);
		
		if(c.getCibilScore()<400)
		{
		String s="LOW";
		c.setStatus(s);
		String s1="cibil score is poor not acceptable";
		c.setRemark(s1);
		
		}
		
		else if(c.getCibilScore()>=500 && c.getCibilScore()<=750)
		{
			String s="MEDIUM";
			c.setStatus(s);
			String s1="cibil score is ok  acceptable";
			c.setRemark(s1);
			
		}
		else if(c.getCibilScore()>750)
		{
			String s="GOOD";
			c.setStatus(s);
			String s1="cibil score is good acceptable";
			c.setRemark(s1);
		}
		Cibil c1 = ser.addcibildetails(c);
	

		return  new ResponseEntity<String>("Data Added Successfully",HttpStatus.OK);
	}
	@DeleteMapping("/deletecibilbyid/{cibilId}")
	public ResponseEntity<List<Cibil>> deletecibildatabyid(@PathVariable int cibilId)
	{
		
		List<Cibil> c2=ser.deletecibilbyid(cibilId);
		return new ResponseEntity<List<Cibil>>(c2, HttpStatus.OK);
	}
	
	@GetMapping("/getallcibildetails")
	public ResponseEntity<List<Cibil>> getallcibildetails()
	{
		
		List<Cibil> c2=ser.getallcibildetails();
		return new ResponseEntity<List<Cibil>>(c2, HttpStatus.OK);
	}
	
	@GetMapping("/getcibildetailsbyid/{cibilId}")
	public ResponseEntity<Cibil> getcibildetailbyid(@PathVariable int cibilId)
	{
		
		Cibil c2=ser.getcibildetailbyid(cibilId);
		return new ResponseEntity<Cibil>(c2, HttpStatus.OK);
	}
	
	@PutMapping("/updatecibildetails")
	public ResponseEntity<Cibil> updatecibildetails(@RequestBody Cibil c)
	{
		
		Cibil c2=ser.addcibildetails(c);
		return new ResponseEntity<Cibil>(c2, HttpStatus.OK);
	}
	
	
	@GetMapping("/getenquirydetailsbyid/{eid}")
	public EnquiryDetails getenquirydetailbyid(@PathVariable int eid)
	{
		
		EnquiryDetails ed=otce.getEnquiryDetails(eid);
		
		return ed;
	
	}

}
