package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Employee;

class EmployeeTest {

	
	
	Employee employee;
	
	@BeforeEach
	public void setUp()
	{
		
		employee=new Employee(101,"Shachi",45000,6500);
	}
	
	//default constructor
	@Test
	public void testConstructorIsValid()
	{
		Employee employee =new Employee();
		assertNotNull(employee);
	}
	
	
	//parameterised constructor
	@Test
	public void testConstructorWithParametersIsObjectCreated()
	{
		Employee employee =new Employee(101,"Shachi" , 45000 ,6500 );
		assertNotNull(employee);
		assertEquals(101, employee.getEmployeeId());
		assertEquals("Shachi", employee.getEmployeeName());
		assertEquals(45000, employee.getSalary());
		assertEquals(6500, employee.getMedicalAllowance());
	}
	
	//test case for net salary
	@Test
	public void testNetSalary()
	{
		employee.netSalary();
		assertEquals(68400 , employee.getNetSalary() , 0.01);
	}
		
}
