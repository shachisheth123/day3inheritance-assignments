package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Manager;

class ManagerTest {
	
	Manager manager ;
	
	@BeforeEach
	public void setUp()
	{
		
		manager=new Manager(101,"Shachi" , 20000 , 6500);
	}

	@Test
	public void testConstructorWithDefaultForObject()
	{
		Manager manager=new Manager();
		assertNotNull(manager);
		
	}

	@Test
	public void testConstructorWithParametrisedForObject()
	{
		Manager manager=new Manager(101 , "Shachi" , 45000 , 6500);
		assertNotNull(manager);
		assertEquals(101, manager.getEmployeeId());
		assertEquals("Shachi", manager.getEmployeeName());
		assertEquals(45000, manager.getSalary());
		assertEquals(6500, manager.getMedicalAllowance());
	}
	
	@Test
	public void testGrossSalary()
	{
		
		manager.grossSalary();
		assertEquals(61100.0, manager.grossSalary());
		
	}
	@Test
	public void testNetSalary()
	{
		
		manager.grossSalary();
		assertEquals(58500.0, manager.netSalary());
		
	}
}
