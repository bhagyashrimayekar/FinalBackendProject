package com.carloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.model.BankDetails;
import com.carloan.service.BankDetailsService;

@RestController
@RequestMapping("/BankDetails")
public class BankDetailsController {
	
	@Autowired
	private BankDetailsService serv;
	
	@PostMapping("/addBankDetails")
	public ResponseEntity<String> addBankDetails(@RequestBody BankDetails bankDetails){
		serv.addBankDetails(bankDetails);
		return new ResponseEntity<String>("Bank Details saved",HttpStatus.OK);
	}
	
	@GetMapping("/getBankDetails")
	public ResponseEntity<List<BankDetails>> getBankDetails(){
		List<BankDetails> blist=serv.getBankDetails();
		return new ResponseEntity<List<BankDetails>>(blist,HttpStatus.OK);
	}

}
