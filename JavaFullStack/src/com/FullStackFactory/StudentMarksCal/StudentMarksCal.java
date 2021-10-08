package com.FullStackFactory.StudentMarksCal;

public class StudentMarksCal {
	
	String name;
	int rollNumber;
	String standard;
	float Mathsmarks;
	float englishMarks;
	float scienceMarks;

	static String school_Name;
	static String school_city;
	static double school_phone;
	
	public StudentMarksCal(String pschool_Name,String pschool_city,double pschool_phone) {
		school_Name = pschool_Name;
		school_city= pschool_city;
		school_phone= pschool_phone;
	}
	

	
	public void MarksCal() {
		double Result;
		
		Result = Mathsmarks+englishMarks+scienceMarks;
		
		System.out.println("Student Details:"+"\nSchool Name:"+school_Name+ "\nSchool City:"+school_city+ "\nSchool Phone:"+school_phone+ "\nStudent Name:"+name+"\nStandard:"+standard);
		System.out.println("Student Total Marks:" + Result);

		if(Mathsmarks <= 0 || englishMarks <= 0 || scienceMarks <= 0) {
			System.out.println("Studen Result : Fail");
		    }
		
			else {
				System.out.println("Student Result : Pass");
			}
		
	}
							
}
		
