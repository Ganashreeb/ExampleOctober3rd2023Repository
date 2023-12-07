package com.sgtesting.NoArgsConstructor;
class Student
{
	String Sname,Sid,doj;
	Student()
	{
		Sname="Mahadev";
		Sid="M19";
		doj="23/10/23";
		System.out.println("STUDENT NAME:          "+Sname);
		System.out.println("STUDENT ID:            "+Sid);
		System.out.println("DATE OF JOIN:          "+doj);
		System.out.println("--------------------------------------------------------");
		System.out.println();
	}
}
class Library
{
	String bookName,author;
	Library()
	{
		bookName="KANNADA";
		author="KUVEMPU";
		System.out.println("BOOK NAME:          "+bookName);
		System.out.println("AUTHOR:            "+author);
		System.out.println("--------------------------------------------------------");
		System.out.println();
	}
}
class Sports
{
	String type,coach;
	Sports()
	{
		type="THROW BALL";
		coach="ARAVIND";
		System.out.println("TYPE OF SPORTS:        "+type);
		System.out.println("COACH NAME:            "+coach);
		System.out.println("--------------------------------------------------------");
		System.out.println();
	}
}
class CsDepartment
{
	String branchName,lab,faculty;
	CsDepartment()
	{
		branchName="DATA SCIENCE";
		lab="JAVA PROGRAMMING";
		faculty="HOD";
		System.out.println("BRANCH NAME:           "+branchName);
		System.out.println("LAB:                   "+lab);
		System.out.println("FACULTY:               "+faculty);
	}
}
public class StudentConstructor 
{
	public static void main(String[] args) 
	{
		Student std=new Student();
		Sports sp=new Sports();
		Library lb=new Library();
		CsDepartment dept=new CsDepartment();
	}
}
