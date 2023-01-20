package com.carloan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carloan.model.CustomerDetails;
import com.carloan.repository.CustomerDetailsRepository;
import com.carloan.service.CustomerDetailsService;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private CustomerDetailsRepository repo;

	@Override
	public CustomerDetails addCustomer(CustomerDetails customerDetails) {

		return repo.save(customerDetails);
	}

	@Override
	public List<CustomerDetails> getcustomerDetails() {
		List<CustomerDetails> cList=repo.findAll();
		return cList;
	}

	@Override
	public List<CustomerDetails> deteleCustomer(int cId) {
		repo.deleteById(cId);
		return repo.findAll();
	}

	@Override
	public CustomerDetails updateCustomerDetail(CustomerDetails customerDetails) {
		return repo.save(customerDetails);
	}

	@Override
	public CustomerDetails getCustomerById(int cId) {
		return repo.findById(cId).get();
	}

}
