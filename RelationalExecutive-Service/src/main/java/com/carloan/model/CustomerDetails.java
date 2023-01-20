package com.carloan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int cId;
	public String fName;
	public String lName;
	public int age;
	public String dob;
	public String gender;
	public String email;
	public long mobileNo;
	public double amountPaidForCar;
	public double totalLoanRequirement;

	@OneToMany(cascade = CascadeType.ALL)
	public List<AllPersonalDocs> allPersonalDocs;
	
	@OneToOne(cascade = CascadeType.ALL)
	public FamilyInfo familyInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	public CustomerProfession customerProfession;
	
	@OneToOne(cascade = CascadeType.ALL)
	public LocalAddress localAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	public PermanentAddress permanentAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	public AccountDetails accountDetails;
	
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	public FamilyInfo getFamilyInfo() {
		return familyInfo;
	}

	public void setFamilyInfo(FamilyInfo familyInfo) {
		this.familyInfo = familyInfo;
	}

	public CustomerProfession getCustomerProfession() {
		return customerProfession;
	}

	public void setCustomerProfession(CustomerProfession customerProfession) {
		this.customerProfession = customerProfession;
	}

	public LocalAddress getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(LocalAddress localAddress) {
		this.localAddress = localAddress;
	}

	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public List<AllPersonalDocs> getAllPersonalDocs() {
		return allPersonalDocs;
	}

	public void setAllPersonalDocs(List<AllPersonalDocs> allPersonalDocs) {
		this.allPersonalDocs = allPersonalDocs;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getAmountPaidForCar() {
		return amountPaidForCar;
	}

	public void setAmountPaidForCar(double amountPaidForCar) {
		this.amountPaidForCar = amountPaidForCar;
	}

	public double getTotalLoanRequirement() {
		return totalLoanRequirement;
	}

	public void setTotalLoanRequirement(double totalLoanRequirement) {
		this.totalLoanRequirement = totalLoanRequirement;
	}

	
}
