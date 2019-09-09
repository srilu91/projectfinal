package com.amock.helloazure.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amock.helloazure.Services.CustomerBalanceInformation;
import com.amock.helloazure.domain.AccountVO;
import com.amock.helloazure.domain.BalanceVO;
import com.amock.helloazure.domain.CustomerVO;
import com.amock.helloazure.domain.StatementVO;

@RestController
@RequestMapping("/banking")
public class BalanceController {
	CustomerBalanceInformation customerBalanceInformation = new CustomerBalanceInformation();
	AccountVO accountInfo = new AccountVO();
	
		
	@GetMapping("/balance")
	public BalanceVO getBalanceForAccout() {
		
		BalanceVO balance = new BalanceVO();
		balance = customerBalanceInformation.getAccountBalance(accountInfo);
		return balance;
	}
	
	@GetMapping("/customerinfo")
	public CustomerVO getCustomerInformation() {
		CustomerVO customer = new CustomerVO();
		customer = customerBalanceInformation.getCustomerInformation(accountInfo);
		return customer;
	}
	
	@GetMapping("/accountinfo")
	public AccountVO getAccountInformation() {
		AccountVO account = new AccountVO();
		account.setAccountNumber("123456789");
		account.setAccountType("Debit");
		account.setAcHolderName("CGI Corporation");
		return account;
	}
	
	@GetMapping("/accountstatement")
	public ArrayList<StatementVO> getAccountStatement() {
		ArrayList<StatementVO> statement = new ArrayList<StatementVO>();
		statement = customerBalanceInformation.getMiniStatement(accountInfo);
		return statement;
	}
	
}
