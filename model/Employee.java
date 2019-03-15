package com.capgemini.employee.model;

public class Employee {
	

	private int employeeId;
	private String employeeName;
	private double salary;
	private double medicalAllowance;
	private double hraAmount;
	private double pfAmount;
	private double ptAmount;
	private double netSalary;
	private double grossSalary;
	
	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	
	
	public Employee()
	{
		
		
	}
	
	public Employee(int employeeId, String employeeName, double salary, double medicalAllowance) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.medicalAllowance = medicalAllowance;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getMedicalAllowance() {
		return medicalAllowance;
	}

	public void setMedicalAllowance(double medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}

	
	public double grossSalary()
	{
		
		hraAmount=0.50*salary;
		grossSalary=salary+hraAmount+medicalAllowance;
		return grossSalary;
		
	}
	
	public double netSalary() {
		double pfAmount=0.12*salary;
		double ptAmount=200;
	
		netSalary=grossSalary()-(ptAmount+pfAmount);
		return netSalary;
		
	}
	
	


}
