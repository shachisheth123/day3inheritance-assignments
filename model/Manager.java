package com.capgemini.employee.model;

public class Manager extends Employee {

	public Manager() {
		super();

	}

	public Manager(int employeeId, String employeeName, double salary, double medicalAllowance) {
		super(employeeId, employeeName, salary, medicalAllowance);

	}

	double netSalary;
	double grossSalary;
	double hraAmount;
	double petrolAllowance;
	double foodAllowance;
	double otherallowance;
	double ptAmount;
	double pfAmount;

	@Override
	public double grossSalary() {
		petrolAllowance = 0.8 * getSalary();
		foodAllowance = 0.13 * getSalary();
		otherallowance = 0.3 * getSalary();

		grossSalary = super.grossSalary() + petrolAllowance + foodAllowance + otherallowance;

		return grossSalary;
	}

	public double netSalary() {
		ptAmount = 200;
		pfAmount = 0.12 * getSalary();
		netSalary = grossSalary- (ptAmount + pfAmount);
		return netSalary;
	}

}
