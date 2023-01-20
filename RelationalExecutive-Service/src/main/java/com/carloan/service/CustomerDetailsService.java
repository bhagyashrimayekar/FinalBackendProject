package com.carloan.service;

import java.util.List;

import com.carloan.model.CustomerDetails;


public interface CustomerDetailsService {
	
	public CustomerDetails addCustomer(CustomerDetails customerDetails);
	
	public CustomerDetails getCustomerById(int cId);

	public List<CustomerDetails> getcustomerDetails();

	public List<CustomerDetails> deteleCustomer(int cId);
	
	public CustomerDetails updateCustomerDetail(CustomerDetails customerDetails);


}
