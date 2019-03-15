package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Manager;
import com.capgemini.employee.model.MarketingExecutive;

public class MarketingTest {
	
	MarketingExecutive marketing;
	
	@Test
	public void testConstructorWithDefaultForObject()
	{
		MarketingExecutive marketing=new MarketingExecutive();
		assertNotNull(marketing);
		
	}
	
	@BeforeEach
	public void setUp()
	{
		marketing = new MarketingExecutive(101 , "Shachi" , 20000 , 6500 , 2 );
		
	}
	
	@Test
	public void testGrossSalary()
	{
		
		marketing.grossSalary();
		assertEquals(38010.0, marketing.grossSalary());
		
	}
	
	@Test
	public void testNetSalary()
	{
		
		marketing.grossSalary();
		assertEquals(35410.0, marketing.netSalary());
		
	}

}
