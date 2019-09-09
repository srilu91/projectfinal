package com.amock.helloazure.Services;

import java.util.ArrayList;

import com.amock.helloazure.domain.AccountVO;
import com.amock.helloazure.domain.BalanceVO;
import com.amock.helloazure.domain.CustomerVO;
import com.amock.helloazure.domain.StatementVO;

public class CustomerBalanceInformation {
	
	public BalanceVO getAccountBalance(AccountVO accountInfo) {
		BalanceVO balance = new BalanceVO();
		AccountVO account = new AccountVO();
		account.setAccountNumber("123456789");
		account.setAccountType("Debit");
		account.setAcHolderName("CGI Corporation");
		balance.setAccountVO(account);
		balance.setBalanceAmount(500000d);
		return balance;
	}
	
	public CustomerVO getCustomerInformation(AccountVO accountInfo) {
		CustomerVO customer = new CustomerVO();
		AccountVO account = new AccountVO();
		account.setAccountNumber("123456789");
		account.setAccountType("Debit");
		account.setAcHolderName("CGI Corporation");
		customer.setAccontInfo(account);
		customer.setGender("female");
		customer.setAccountNumber("123456789");
		customer.setName("CGI Corporation");
		return customer;
	}
	public ArrayList<StatementVO> getMiniStatement(AccountVO accountInfo) {
		
		ArrayList<StatementVO> statements = new ArrayList<StatementVO>();
		
		StatementVO statement = new StatementVO();
		AccountVO account = new AccountVO();
		account.setAccountNumber("123456789");
		account.setAccountType("Debit");
		account.setAcHolderName("CGI Corporation");
		statement.setAccountInfo(account);
		statement.setAmount(String.valueOf(Math.random()));
		statement.setDate("07-09-2019");
		statement.setDr_cr("dr");
		
		statements.add(statement);
		statements.add(statement);
		
		return statements;
	}
}
