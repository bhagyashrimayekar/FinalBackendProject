package com.carloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.model.LoanDetails;
import com.carloan.service.LoanDetailsService;

@RestController
@RequestMapping("/loandetails")

public class LoanDetailsController {
	
	@Autowired
	private LoanDetailsService ser;
	

	@PostMapping("/adddetails")
public LoanDetails addLoanDetailData(@RequestBody LoanDetails lc) {
	 
	ser.addLoanDetail(lc);
	
	return lc;
	
}
	  @GetMapping("/getloandetails")
	public List<LoanDetails>getLoanDetails(){
		
		List<LoanDetails> ldlist =ser.getAllDetails();
		return ldlist;
		
	}

	  @DeleteMapping("/delloandetails/{loanId}")
	  public List<LoanDetails>deleteById(@PathVariable int loanId){
		  
		  List<LoanDetails> list = ser.deleteById(loanId);
		return list; 
		  
	  }
	
}
