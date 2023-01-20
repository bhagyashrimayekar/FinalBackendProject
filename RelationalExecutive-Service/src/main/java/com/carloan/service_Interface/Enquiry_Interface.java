package com.carloan.service_Interface;

import java.util.List;

import com.carloan.model.Enquiry;

public interface Enquiry_Interface {

public Enquiry registerEnquiry(Enquiry enquiry);

public List<Enquiry> getAllEnquiryData();

public List<Enquiry> GetAllEnquiryByDate(String createDate);

public Enquiry getEnquiryById(int eid);

public Enquiry updateEnquiryById(Enquiry enquiry);

//public Enquiry updateEnquiry(Enquiry enquiry);

public List<Enquiry> deteleEnquiriy(int eid);




}
