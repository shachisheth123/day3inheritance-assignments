package com.capgemini.employee.model;

public class PublicTraining extends Training{
	
	private int participants;

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public PublicTraining() {
		super();
		
	}

	public PublicTraining(int id, String subjectName, double fees ,int participants) {
		super(id, subjectName, fees);
		this.participants=participants;
	}
	
	
	@Override
	public double getOrderValue()
	{
		return getFees()*participants;
	}

}
