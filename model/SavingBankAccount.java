package com.capgemini.employee.model;

public class SavingBankAccount extends BankAccount {
	public static final double MINIMUM_BALANCE = 10000;

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	private boolean salaryAccount;

	public SavingBankAccount(int accountId, String accountholderName, String accountType, double accountBalance,
			boolean salaryAccount) {
		super(accountId, accountholderName, accountType, accountBalance);
		this.salaryAccount = salaryAccount;
	}

	@Override
	public double withdraw(double amount) {
		if (salaryAccount) {
			return super.withdraw(amount);
		} else {
			if (getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount);
			else
				System.out.println("you don't have sufficient fund.");
			return getAccountBalance();
		}
	}

}
