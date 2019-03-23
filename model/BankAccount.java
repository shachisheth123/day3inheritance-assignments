package com.capgemini.employee.model;

public class BankAccount {
	
	private int accountId;
	private String accountholderName;
	private String accountType;
	private double accountBalance;
	
	
	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountholderName() {
		return accountholderName;
	}

	public void setAccountholderName(String accountholderName) {
		this.accountholderName = accountholderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public BankAccount(int accountId, String accountholderName, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountholderName = accountholderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public double withdraw(double amount) {
	if(accountBalance>=amount)
		accountBalance=accountBalance-amount;
	else 
		System.out.println("You dont have sufficient balance");
	return accountBalance;
	
	}

	public double deposit(double amount) {
		accountBalance=accountBalance+amount;
		return accountBalance;
	}


}
