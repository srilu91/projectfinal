package com.amock.helloazure.domain;

public class CustomerVO {
	private String name;
	private String gender;
	private String accountNumber;
	private String accounttype;
	private AccountVO accontInfo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public AccountVO getAccontInfo() {
		return accontInfo;
	}
	public void setAccontInfo(AccountVO accontInfo) {
		this.accontInfo = accontInfo;
	}
	
}
