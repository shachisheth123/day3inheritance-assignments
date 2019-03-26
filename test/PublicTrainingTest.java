package com.capgemini.employee.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

import com.capgemini.employee.model.PublicTraining;
import com.capgemini.employee.model.Training;

public class PublicTrainingTest {

	Training publicTraining;

	@Test
	public void testDefaultConstrustor() {

		publicTraining = new PublicTraining();
		assertNotNull(publicTraining);
	}

	/*
	 * @Test public void testParameterisedConstructor() {
	 * 
	 * publicTraining = new PublicTraining(101, "Java", 5000.00, 50);
	 * assertNotNull(publicTraining); assertEquals(101, publicTraining.getId());
	 * assertEquals("Java", publicTraining.getSubjectName()); assertEquals(5000.50,
	 * publicTraining.getFees()); assertEquals(50, publicTraining.get);
	 * 
	 * }
	 */
	@Test
	public void testGetOrderValue() {
		
		publicTraining=new PublicTraining(101, "Java", 5000.0, 50);
		assertEquals(250000, publicTraining.getOrderValue(),0.1);
	}

}
