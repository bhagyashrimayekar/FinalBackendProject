package com.carloan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloan.model.Ledger;
import com.carloan.service.LedgerService;

@RestController
@RequestMapping("/Ledgerdetails")
public class LedgerController {
	

	@Autowired
	private MailSender mailsender;
	
	@Autowired
	private LedgerService ser;

	@PostMapping("/adddetails")
	public Ledger addLedgerData(@RequestBody Ledger l) {
		 
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(l.getEmailId());
		email.setSubject("job");
		email.setText("Ledger Id="+l.getLedgerId()+"LedgerCreateDate="+l.getLedgerCreateDate()+" TotalLoanAmount="+l.getTotalLoanAmount()+"payableAmountWithInterest="+l.getPayableAmountWithInterest()+"tenure="+l.getTenure()+"monthlyEMI="+l.getMonthlyEMI()+"amountPaidTillDate="+l.getAmountPaidTillDate()+"remainingAmount="+l.getRemainingAmount()+"nextEmiDateStart="+l.getNextEmiDateStart()+"nextEmiDateEnd="+l.getNextEmiDateEnd()+"defaulterCount="+l.getDefaulterCount()+"EmiStatus="+l.getEmiStatus()+"loanEndDate="+l.getLoanEndDate()+"loanStatus="+l.getLoanStatus()+"currentMonthEmiStatus="+l.getCurrentMonthEmiStatus());
		mailsender.send(email);
		ser.addLedgerData(l);
		
		return l;
		
	}
	
	  @GetMapping("/getledgerdetails")
		public List<Ledger>getLedgerDetails(){
			
			List<Ledger> llist =ser.getAllDetails();
			return llist;
			
}
	  @DeleteMapping("/delledgerdetails/{ledgerId}")
	  public List<Ledger>deleteById(@PathVariable int ledgerId){
		  
		  List<Ledger> list = ser.deleteById(ledgerId);
		return list; 
		  
	  }
	  @PutMapping("/update") 
	  public List<Ledger> updateLedger(@RequestBody Ledger ledger) {
	 
	 ser.addLedgerData(ledger);
	  List<Ledger>llist=ser.getAllDetails();
	  return llist;
	 
	  }
	  
}