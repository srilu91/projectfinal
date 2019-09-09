package com.amock.helloazure.domain;

public class AccountVO {
	private String accountNumber;
	private String accountType;
	private String acHolderName;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAcHolderName() {
		return acHolderName;
	}
	public void setAcHolderName(String acHolderName) {
		this.acHolderName = acHolderName;
	}
}
