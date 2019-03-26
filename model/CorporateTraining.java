package com.capgemini.employee.model;

public class CorporateTraining extends Training {

	private int days;

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public CorporateTraining() {
		super();
	
	}

	public CorporateTraining(int id, String subjectName, double fees, int days) {
		super(id, subjectName, fees);
		this.days = days;
	}

	@Override
	public double getOrderValue() {
		
		return getFees()*days;
	}

}
