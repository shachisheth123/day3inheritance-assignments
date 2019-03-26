package com.capgemini.employee.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.employee.model.CorporateTraining;
import com.capgemini.employee.model.PublicTraining;
import com.capgemini.employee.model.Training;

public class TrainingTest {

	Training training;

	@Test
	public void testPublicTraingIsEmptyOrNot() {

		training=new PublicTraining(101,"Java",5000.50 ,50); 
		
		assertNotNull(training);
		
		
}
	
	@Test
	public void testCorporateTraingIsEmptyOrNot() {

		training=new CorporateTraining(101,"Java",5000.50 ,10); 
		
		assertNotNull(training);
		
		
}
}