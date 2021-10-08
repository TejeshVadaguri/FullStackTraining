package com.FullStackFactory.employee;

public class Employee {
	
	int empId;
	String empName;
	double empSalary;
	
	//Non-Argument Constructor
	
	public Employee() {
		this.empId=1414;
		this.empName="hars";
		this.empSalary=14536;
	}
	
	//Parameterized constructor
	
	public Employee(int pempId, String pempName, double pempSalary ) {
		empId = pempId;
		empName = pempName;
		empSalary=pempSalary;
		
	}
	
	public void employeeTaxCalculation() {
		
		double tax;
		tax=(empSalary*10)/100;
		System.out.println("Tax Calculation:" +"\nEmployee Name:"+empName+ "\nEmployee Salary:"+empSalary);
		System.out.println("The 10% Tax payable from the employee salary :"+ tax);
		
	}
	
	

}
