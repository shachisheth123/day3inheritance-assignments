package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.CurrentBankAccount;

public class CurrentBankAccountTest {

	CurrentBankAccount currentAccount;

	@Test
	public void testWithdrawWithSufficientBalance()
 
	{
		currentAccount = new CurrentBankAccount(101, "shachi", "Current", 90000.0,50000);
		assertEquals(55000, currentAccount.withdraw(35000),0.1);
	}

	@Test
	public void testDeposit() {
		currentAccount = new CurrentBankAccount(101, "shachi", "Current", 90000.0,50000);

		assertEquals(92000.0, currentAccount.deposit(2000.0), 0.1);
	}

	@Test
	public void testWithdrawwithInsufficientUsingDebitAmount()

	{
		currentAccount = new CurrentBankAccount(101, "shachi", "Current", 90000.0,5000.0);
		assertEquals(90000, currentAccount.withdraw(100000.0),0.1);
		assertEquals(0.0,currentAccount.getBorrowedAmount(),0.1);
	}
	@Test
	public void testWithdrawWithZeroDebitAmount()
	{
	 currentAccount = new CurrentBankAccount(101, "John Doe","Current", 90000.0, 50000.0);
	 assertEquals(95000, currentAccount.deposit(5000),0.1);
	}
	
	@Test
	public void testDepositWithZeroDebitAmount()
	{
		 currentAccount = new CurrentBankAccount(101, "John Doe","Current", 90000.0, 50000.0);
		 assertEquals(95000, currentAccount.deposit(5000),0.1);
	}


	@Test
	public void testDepositWithSomeDebitAmount()
	{
		currentAccount = new CurrentBankAccount(101, "John Doe","Current", 90000.0, 50000.0);
		currentAccount.withdraw(50000);
		assertEquals(46000.0, currentAccount.deposit(6000),0.1);
	}
	
	

}
