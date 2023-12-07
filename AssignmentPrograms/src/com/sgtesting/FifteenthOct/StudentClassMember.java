package com.sgtesting.FifteenthOct;
class Student
{
	String Sname,Sid,doj;
}
class Library
{
	String bookName,author;
}
class Sports
{
	String type,coach;
}
class CsDepartment
{
	String branchName,lab,faculty;
}
public class StudentClassMember 
{
	public static void main(String[] args) 
	{
		Student std=new Student();
		std.Sname="Mahadev";
		std.Sid="M19";
		std.doj="23/10/23";
		System.out.println("STUDENT NAME:          "+std.Sname);
		System.out.println("STUDENT ID:            "+std.Sid);
		System.out.println("DATE OF JOIN:          "+std.doj);
		System.out.println("--------------------------------------------------------");
		System.out.println();
		Sports sp=new Sports();
		sp.type="THROW BALL";
		sp.coach="ARAVIND";
		System.out.println("TYPE OF SPORTS:        "+sp.type);
		System.out.println("COACH NAME:            "+sp.coach);
		System.out.println("--------------------------------------------------------");
		System.out.println();
		CsDepartment dept=new CsDepartment();
		dept.branchName="DATA SCIENCE";
		dept.lab="JAVA PROGRAMMING";
		dept.faculty="HOD";
		System.out.println("BRANCH NAME:           "+dept.branchName);
		System.out.println("LAB:                   "+dept.lab);
		System.out.println("FACULTY:               "+dept.faculty);
	}
}
