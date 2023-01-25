package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class AllPersonalDocs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int cid;
	@Lob
	public byte[] panCard;
	@Lob
	public byte[] photo;
	@Lob
	public byte[] adharCard;

	@Lob
	public byte[] salarySlips;

	@Lob
	public byte[] bankStatement;

	@Lob
	public byte[] addressProof;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public byte[] getPanCard() {
		return panCard;
	}

	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public byte[] getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(byte[] adharCard) {
		this.adharCard = adharCard;
	}

	public byte[] getSalarySlips() {
		return salarySlips;
	}

	public void setSalarySlips(byte[] salarySlips) {
		this.salarySlips = salarySlips;
	}

	public byte[] getBankStatement() {
		return bankStatement;
	}

	public void setBankStatement(byte[] bankStatement) {
		this.bankStatement = bankStatement;
	}

	public byte[] getAddressProof() {
		return addressProof;
	}

	public void setAddressProof(byte[] addressProof) {
		this.addressProof = addressProof;
	}

}
