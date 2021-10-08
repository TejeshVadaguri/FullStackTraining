package com.FullStackFactory.StudentMarksCal;

public class MarksCal {

	public static void main(String[] args) {

		StudentMarksCal stu1=new StudentMarksCal("Talent","Nellore",45555);
		stu1.school_Name="Highschool";
		stu1.school_city="Nellore";
		stu1.school_phone=995955d;
		stu1.name="Raj";
		stu1.standard="Tenth";
		stu1.rollNumber=66;
		stu1.Mathsmarks=22;
		stu1.englishMarks=16;
		stu1.scienceMarks=45;
		stu1.MarksCal();
	
		
		StudentMarksCal stu2=new StudentMarksCal("Talent","Nellore",45555);
		stu2.name="mah";
		stu2.standard="Tenth";
		stu2.rollNumber=66;
		stu2.Mathsmarks=22;
		stu2.englishMarks=16;
		stu2.scienceMarks=0;
		stu2.MarksCal(); 
		
		StudentMarksCal stu3=new StudentMarksCal("Talent","Nellore",45555);
		stu3.name="mano";
		stu3.standard="Tenth";
		stu3.rollNumber=66;
		stu3.Mathsmarks=22;
		stu3.englishMarks=16;
		stu3.scienceMarks=0;
		stu3.MarksCal();
	}

}
