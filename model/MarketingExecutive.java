package com.capgemini.employee.model;

public class MarketingExecutive extends Employee {
	
	
	int kilometerTravelled;
	int tourAllowance;
	int telephoneAllowance;
	double grossSalary;
	double pfAmount;
	int ptAmount;
	double netSalary;

	public MarketingExecutive() {
		super();
		
	}

	public MarketingExecutive(int employeeId, String employeeName, double salary, double medicalAllowance , 	int kilometerTravelled) {
		super(employeeId, employeeName, salary, medicalAllowance);
		this.kilometerTravelled=kilometerTravelled;
	}
	
	@Override
	public double grossSalary()
	{
		tourAllowance=5*kilometerTravelled;
		telephoneAllowance=1500;
		grossSalary = super.grossSalary() + tourAllowance + telephoneAllowance;
		return grossSalary;
		 
	}
	
	public double netSalary()
	{
		pfAmount=0.12*getSalary();
		ptAmount=200;
		
		netSalary=grossSalary-(pfAmount+ptAmount);
		return netSalary;
	}

}
