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

import com.carloan.model.SanctionLetter;
import com.carloan.service.SanctionLetterService;

@RestController
@RequestMapping("/sanctionletter")
public class SanctionLetterController {
	@Autowired
	private SanctionLetterService sls;
	@PostMapping("/addsanctiondetails")
  public ResponseEntity<String> addsanctionletterdetails(@RequestBody SanctionLetter sl)
  {
		sls.addsanctionletterdetails(sl);
	 return new ResponseEntity<String>("data added successfully",HttpStatus.OK);
  }
	
	@DeleteMapping("/deletesanctiondetailsbyid/{sId}")
	  public ResponseEntity<List<SanctionLetter>> deletesanctionletterdetails(@PathVariable int sId)
	  {
			List<SanctionLetter>s2=sls.deletesanctionletterdetailsbyid(sId);
		 return new ResponseEntity<List<SanctionLetter>>(s2,HttpStatus.OK);
	  }
	
	@GetMapping("/getsanctiondetailsbyid/{sId}")
	  public ResponseEntity<SanctionLetter> getsanctionletterdetails(@PathVariable int sId)
	  {
			SanctionLetter s2=sls.getsanctionletterdetailsbyid(sId);
		 return new ResponseEntity<SanctionLetter>(s2,HttpStatus.OK);
	  }
	
	
	@GetMapping("/getallsanctiondetails")
	  public ResponseEntity<List<SanctionLetter>> getallsanctionletterdetails()
	  {
		List<SanctionLetter> s2=sls.getallsanctionletterdetails();
		 return new ResponseEntity<List<SanctionLetter>>(s2,HttpStatus.OK);
	  }
	
	@PutMapping("/updatesanctiondetails")
	  public ResponseEntity<SanctionLetter> updatesanctionletterdetails(@RequestBody SanctionLetter sl)
	  {
		SanctionLetter s2=sls.addsanctionletterdetails(sl);
		 return new ResponseEntity<SanctionLetter>(s2,HttpStatus.OK);
	  }
	
	

}
