package com.capgemini.employee.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.employee.model.CorporateTraining;
import com.capgemini.employee.model.Training;

public class CorporateTrainingTest {

	Training corporateTraining;
	
	
	@Test
	public void testCorporateTraining() {
		
		corporateTraining=new CorporateTraining(101,"Java" ,5000.50 ,10);
		assertEquals(50005, corporateTraining.getOrderValue(),0.1	);
	}

}
