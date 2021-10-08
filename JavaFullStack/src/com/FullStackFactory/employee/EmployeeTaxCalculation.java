package com.FullStackFactory.employee;

public class EmployeeTaxCalculation {

	public static void main(String[] args) {

	    Employee emp1=new Employee();
		emp1.empId=63135;
		emp1.empName="Raj";
		emp1.empSalary=64636;
		emp1.employeeTaxCalculation();
		
		Employee emp2=new Employee();
		emp2.empId=545;
		emp2.empName="Mah";
		emp2.empSalary=565752;
		emp2.employeeTaxCalculation();
		
		
		//Non-Argument calling
		Employee emp3=new Employee();
		emp3.employeeTaxCalculation();  
		
		// Parameterized calling
		
		Employee emp4=new Employee(1212,"Srihar",4554555);
		emp4.employeeTaxCalculation();
		}
	}


