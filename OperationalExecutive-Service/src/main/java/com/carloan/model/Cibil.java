package com.carloan.model;



public class Cibil {
	
	private int cibilId;
	private int cibilScore;
	private String cibilScoreDateTime;
	private String status;
	private String remark;
	public int getCibilId() {
		return cibilId;
	}
	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getCibilScoreDateTime() {
		return cibilScoreDateTime;
	}
	public void setCibilScoreDateTime(String cibilScoreDateTime) {
		this.cibilScoreDateTime = cibilScoreDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
