package com.sgtesting.SeventeenthOct;
class Examination
{
	Examination(String sname,String subject)
	{
		System.out.println("Student name: "+sname);
		System.out.println("Subject: "+subject);
	}
	Examination(double  rollno,double roomno)
	{
		System.out.println("Roll number: "+rollno);
		System.out.println("Room number: "+roomno);
	}
	Examination(int noofsub,int accademicyr)
	{
		System.out.println("Number of subjects: "+noofsub);
		System.out.println("Accademic year: "+accademicyr);
	}
}
public class ExaminationConstructorDemo 
{
	public static void main(String[] args) 
	{
		Examination ex=new Examination("Avyan Mahadev","Computer science");
		Examination exa=new Examination(19.00,1.2);
		Examination ex1=new Examination(6,2023);
	}

}
