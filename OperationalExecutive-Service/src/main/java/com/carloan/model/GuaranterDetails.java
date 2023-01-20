package com.carloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GuaranterDetails {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
		private	int gid;
		private String gName; 		
		private String gDateofBirth;	
		private String gRelationshipwithCustomer;		
		private double gMobNo;	
		private double gAdharCardNo;	
		private String gMortgageDetails;	
		private String gJobDetails;		
		private String gloaclAddress;		
		private String gPermanentAddress;
		public int getGid() {
			return gid;
		}
		public void setGid(int gid) {
			this.gid = gid;
		}
		public String getgName() {
			return gName;
		}
		public void setgName(String gName) {
			this.gName = gName;
		}
		public String getgDateofBirth() {
			return gDateofBirth;
		}
		public void setgDateofBirth(String gDateofBirth) {
			this.gDateofBirth = gDateofBirth;
		}
		public String getgRelationshipwithCustomer() {
			return gRelationshipwithCustomer;
		}
		public void setgRelationshipwithCustomer(String gRelationshipwithCustomer) {
			this.gRelationshipwithCustomer = gRelationshipwithCustomer;
		}
		public Double getgMobNo() {
			return gMobNo;
		}
		public void setgMobNo(Double gMobNo) {
			this.gMobNo = gMobNo;
		}
		public Double getgAdharCardNo() {
			return gAdharCardNo;
		}
		public void setgAdharCardNo(Double gAdharCardNo) {
			this.gAdharCardNo = gAdharCardNo;
		}
		public String getgMortgageDetails() {
			return gMortgageDetails;
		}
		public void setgMortgageDetails(String gMortgageDetails) {
			this.gMortgageDetails = gMortgageDetails;
		}
		public String getgJobDetails() {
			return gJobDetails;
		}
		public void setgJobDetails(String gJobDetails) {
			this.gJobDetails = gJobDetails;
		}
		public String getGloaclAddress() {
			return gloaclAddress;
		}
		public void setGloaclAddress(String gloaclAddress) {
			this.gloaclAddress = gloaclAddress;
		}
		public String getgPermanentAddress() {
			return gPermanentAddress;
		}
		public void setgPermanentAddress(String gPermanentAddress) {
			this.gPermanentAddress = gPermanentAddress;
		}		
	


}
