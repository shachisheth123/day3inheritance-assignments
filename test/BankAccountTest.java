package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.BankAccount;

public class BankAccountTest {

	BankAccount bankAccount ;
	
	@Before
	public void setUp() {
		bankAccount = new BankAccount(101, "Shachi", "Saving", 896536.5);
		
	}
	@Test
	public void testWithdraw()
	{
		
		assertEquals(890536.0, bankAccount.withdraw(6000.50),0.5);
	}
	@Test
	public void testDeposit()
	{
		
		assertEquals(902537.0, bankAccount.deposit(6000.50),0.5);
		
	}
	

}
