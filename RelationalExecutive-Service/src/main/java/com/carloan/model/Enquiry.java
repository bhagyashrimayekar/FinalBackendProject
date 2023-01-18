package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Enquiry {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private String dob;
	private int age;
	private String gender;
	private String  email;
	private long mobileNo;
	private  String pancardNo;
	private long addharCardNo;

}
