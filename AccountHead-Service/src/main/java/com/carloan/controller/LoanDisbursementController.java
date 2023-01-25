package com.carloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.model.LoanDisbursement;

import com.carloan.service.LoanDisbursementService;

@RestController
@RequestMapping("/LoanDisbursement")

public class LoanDisbursementController {

	@Autowired
	private LoanDisbursementService ser;

	@PostMapping("/adddetails")
	public LoanDisbursement addLoanDisbursementData(@RequestBody LoanDisbursement l) {
		 
		ser.addLoanDisbursementData(l);
		
		return l;
}
	

	  @GetMapping("/getdetails")
		public List<LoanDisbursement>getLoanDisbursementrDetails(){
			
			List<LoanDisbursement> ldlist =ser.getAllDetails();
			return ldlist;
}
	  

	  @DeleteMapping("/deldetails/{agreementId}")
	  public List<LoanDisbursement>deleteById(@PathVariable int agreementId){
		  
		  List<LoanDisbursement> list = ser.deleteById(agreementId);
		return list; 
		  
	  }
	  

@PutMapping("/update") 
public List<LoanDisbursement> updateLoanDisbursement(@RequestBody LoanDisbursement ld) {

ser.addLoanDisbursementData(ld);
List<LoanDisbursement>ldlist=ser.getAllDetails();
return ldlist;

}

}