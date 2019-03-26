package com.capgemini.employee.model;

public abstract class Training {

	public abstract double getOrderValue();

	private int id;
	private String subjectName;
	private double fees;

	public Training() {

	}

	public Training(int id, String subjectName, double fees) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

}
