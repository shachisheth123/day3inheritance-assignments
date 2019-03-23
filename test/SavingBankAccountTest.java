package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.employee.model.SavingBankAccount;

public class SavingBankAccountTest {

	@Test
	public void testWithdrawWithSavingSufficientBalance() {
		SavingBankAccount savingAccount = new SavingBankAccount(101, "Shachi", "Saving", 15000.0, true);
		assertEquals(10000.0, savingAccount.withdraw(5000.0), 0.1);

	}
	
	@Test
	public void testWithdrawWithSavingInSufficientBalance()
	{
		SavingBankAccount savingAccount = new SavingBankAccount(101, "Shachi", "Saving", 15000.0, true);
		assertEquals(15000.0, savingAccount.withdraw(25000.0), 0.1);
		
	}
	
	@Test
	public void testWithdrawWithSavingAccountWithsufficientBalance()
	{
		SavingBankAccount savingAccount = new SavingBankAccount(101, "Shachi", "Saving", 15000.0, true);
		assertEquals(10000.0, savingAccount.withdraw(5000.0),0.1);
		
	}
	@Test
	public void testWithdrawWithSavingAccountWithInsufficientBalance() {
		SavingBankAccount savingAccount = new SavingBankAccount(101, "Shachi", "Saving", 15000.0, true);
		assertEquals(15000.0, savingAccount.withdraw(35000.0),0.1);
		
		
	}
	
	@Test
	public void testDepositForSavingBankAccountForSalaryAccount() {
		SavingBankAccount savingAccount = new SavingBankAccount(101, "Shachi", "Saving", 15000.0, true);
		assertEquals(20000.0, savingAccount.deposit(5000.0),0.1);
	}
	
}
