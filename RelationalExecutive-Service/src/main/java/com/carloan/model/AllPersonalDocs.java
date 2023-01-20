package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AllPersonalDocs {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	public int dID;
    public byte addressProof;
    public byte panCard;
    public byte incomeTaxReturn;
    public byte aadharCard;
    public byte photo;
    public byte signature;
    //public byte thumb;
    public byte bankCheque;
    public byte salarySlip;
    
    @ManyToOne
    public CustomerDetails customerDetails;
    
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public byte getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(byte addressProof) {
		this.addressProof = addressProof;
	}
	public byte getPanCard() {
		return panCard;
	}
	public void setPanCard(byte panCard) {
		this.panCard = panCard;
	}
	public byte getIncomeTaxReturn() {
		return incomeTaxReturn;
	}
	public void setIncomeTaxReturn(byte incomeTaxReturn) {
		this.incomeTaxReturn = incomeTaxReturn;
	}
	public byte getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(byte aadharCard) {
		this.aadharCard = aadharCard;
	}
	public byte getPhoto() {
		return photo;
	}
	public void setPhoto(byte photo) {
		this.photo = photo;
	}
	public byte getSignature() {
		return signature;
	}
	public void setSignature(byte signature) {
		this.signature = signature;
	}
	public byte getBankCheque() {
		return bankCheque;
	}
	public void setBankCheque(byte bankCheque) {
		this.bankCheque = bankCheque;
	}
	public byte getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(byte salarySlip) {
		this.salarySlip = salarySlip;
	}

}