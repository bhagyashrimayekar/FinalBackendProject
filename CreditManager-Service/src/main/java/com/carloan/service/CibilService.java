package com.carloan.service;

import java.util.List;

import com.carloan.model.Cibil;

public interface CibilService {
	
	
	public Cibil addcibildetails(Cibil c);
	
	public List<Cibil> deletecibilbyid(int cibilId);
	
	public List<Cibil> getallcibildetails();
	
	public Cibil getcibildetailbyid(int cibilId);
	

}
