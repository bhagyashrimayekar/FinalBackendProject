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

import com.carloan.model.CustomerDetails;
import com.carloan.service.CustomerDetailsService;

@RestController
@RequestMapping("/CustomerDetails")
public class CustomerDetailsController {

	@Autowired
	private CustomerDetailsService service;

	@PostMapping("/addCustomer")
	public CustomerDetails addCustomer(@RequestBody CustomerDetails customerDetails) {
		return service.addCustomer(customerDetails);
	}

	@GetMapping("/getCustomerById/{cId}")
	public CustomerDetails getCustomerById(@PathVariable int cId) {
		return service.getCustomerById(cId);
	}

	@GetMapping("/getcustomerDetails")
	public List<CustomerDetails> getcustomerDetails() {
		List<CustomerDetails> cList = service.getcustomerDetails();
		return cList;
	}

	@DeleteMapping("/deteleCustomer/{cId}")
	public ResponseEntity<String> deteleCustomer(@PathVariable int cId) {
		service.deteleCustomer(cId);
		return new ResponseEntity<String>("Customer Deleted", HttpStatus.OK);

	}

	@PutMapping("/updateCustomerDetail")
	public CustomerDetails updateCustomerDetail(@RequestBody CustomerDetails customerDetails) {
		return service.updateCustomerDetail(customerDetails);
	}
}
