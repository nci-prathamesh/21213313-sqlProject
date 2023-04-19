package com.pxp.SQLite.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LoanApplication {
	
	@Id
	@GeneratedValue
	 private Long applicationId;
     private String userId;
	 private String loanAmount;
	 private String expectedTenure;
	 private String annualIncome;
	 private String loanUsedFor;
	 private String maritalStatus;
	 private String address;
	 private String city;
	 private String state;
	 private String userType;
	 private String status;
	 
	 public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getApplicationId() {
		return applicationId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getExpectedTenure() {
		return expectedTenure;
	}
	public void setExpectedTenure(String expectedTenure) {
		this.expectedTenure = expectedTenure;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getLoanUsedFor() {
		return loanUsedFor;
	}
	public void setLoanUsedFor(String loanUsedFor) {
		this.loanUsedFor = loanUsedFor;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
