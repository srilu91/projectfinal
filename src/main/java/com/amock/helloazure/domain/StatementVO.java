package com.amock.helloazure.domain;

public class StatementVO {
private AccountVO accountInfo;
private String sno;
private String description;
private String date;
private String dr_cr;
private String amount;
private String totalBalance;
public AccountVO getAccountInfo() {
	return accountInfo;
}
public void setAccountInfo(AccountVO accountInfo) {
	this.accountInfo = accountInfo;
}
public String getSno() {
	return sno;
}
public void setSno(String sno) {
	this.sno = sno;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getDr_cr() {
	return dr_cr;
}
public void setDr_cr(String dr_cr) {
	this.dr_cr = dr_cr;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getTotalBalance() {
	return totalBalance;
}
public void setTotalBalance(String totalBalance) {
	this.totalBalance = totalBalance;
}
}
