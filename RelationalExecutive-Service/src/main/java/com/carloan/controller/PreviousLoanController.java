package com.carloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.model.PreviousLoan;
import com.carloan.service.PreviousLoanService;

@RestController
@RequestMapping("/previousloan")
public class PreviousLoanController {
	@Autowired
	private PreviousLoanService pls;
	@PostMapping("/addpreviousloandetails")
	public ResponseEntity<String> addpreviousloandeatil(@RequestBody PreviousLoan pl)
	{
		pls.addPrevLoanDetails(pl);
		return new ResponseEntity<String>("previous Loan detail added successfully",HttpStatus.OK);
	}
	
	@GetMapping("/getpreviousloandetails/{ploanId}")
	public ResponseEntity<PreviousLoan> getpreviousloandeatilbyid(@PathVariable int ploanId)
	{
		PreviousLoan pls1=pls.getPrevLoanDetails(ploanId);
		return new ResponseEntity<PreviousLoan>(pls1,HttpStatus.OK);
	}
	
	@GetMapping("/getallpreviousloandetails")
	public List<PreviousLoan> getallpreviousloandeatil()
	{
		List<PreviousLoan> pls1=pls.getallpreviousloandetails();
		return  pls1;
	}
	
	
	@DeleteMapping("/deletepreviousloandetails/{ploanId}")
	public List<PreviousLoan> deletepreviousloandeatilbyid(@PathVariable int ploanId)
	{
	     List<PreviousLoan> pls1=pls.deletebyid(ploanId);
		return pls1;
	}
	
	@PutMapping("/upadatepreviousloandetails")
	public PreviousLoan updatepreviousloandeatilbyid(@RequestBody PreviousLoan pl)
	{
	     PreviousLoan pls1=pls.addPrevLoanDetails(pl);
		return pls1;
	}
}
