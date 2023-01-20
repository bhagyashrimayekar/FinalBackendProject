package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class PropertyInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int propertyId;
	private String propertyType;
	private String propertyArea;
	private String constructionArea;
	private double propertyPrice;
	private double constructionPrice;
	private Byte[] propertyDocuments;
	private Byte[] priceProofs;
	@OneToOne
	private PropertyAddress propertyaddress;
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPropertyArea() {
		return propertyArea;
	}
	public void setPropertyArea(String propertyArea) {
		this.propertyArea = propertyArea;
	}
	public String getConstructionArea() {
		return constructionArea;
	}
	public void setConstructionArea(String constructionArea) {
		this.constructionArea = constructionArea;
	}
	public double getPropertyPrice() {
		return propertyPrice;
	}
	public void setPropertyPrice(double propertyPrice) {
		this.propertyPrice = propertyPrice;
	}
	public double getConstructionPrice() {
		return constructionPrice;
	}
	public void setConstructionPrice(double constructionPrice) {
		this.constructionPrice = constructionPrice;
	}
	public Byte[] getPropertyDocuments() {
		return propertyDocuments;
	}
	public void setPropertyDocuments(Byte[] propertyDocuments) {
		this.propertyDocuments = propertyDocuments;
	}
	public Byte[] getPriceProofs() {
		return priceProofs;
	}
	public void setPriceProofs(Byte[] priceProofs) {
		this.priceProofs = priceProofs;
	}
	public PropertyAddress getPropertyaddress() {
		return propertyaddress;
	}
	public void setPropertyaddress(PropertyAddress propertyaddress) {
		this.propertyaddress = propertyaddress;
	}
	

}
