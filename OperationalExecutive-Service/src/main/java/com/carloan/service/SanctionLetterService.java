package com.carloan.service;

import java.util.List;

import com.carloan.model.SanctionLetter;

public interface SanctionLetterService {
	public SanctionLetter addsanctionletterdetails(SanctionLetter sl);
	
	public List<SanctionLetter> deletesanctionletterdetailsbyid(int sId);

	public SanctionLetter getsanctionletterdetailsbyid(int sId);
	
	public List<SanctionLetter> getallsanctionletterdetails();


}
