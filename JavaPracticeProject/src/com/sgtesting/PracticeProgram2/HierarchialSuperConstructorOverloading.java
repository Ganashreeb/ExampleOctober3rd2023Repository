package com.sgtesting.PracticeProgram2;
class CollegeA
{
	CollegeA(String name)
	{
		System.out.println("College name: "+name);
	}
	CollegeA(int code)
	{
		System.out.println("College code: "+code);
	}
	CollegeA(String area,int pincode)
	{
		System.out.println("Address of College: "+area);
		System.out.println("Pincode of the area: "+pincode);
	}
}
class Student1 extends CollegeA
{
	Student1(String name,String name1)
	{
	super(name);
	System.out.println("Student name: "+name1);
	}
	Student1(int code,String id)
	{
		super(code);
		System.out.println("Student ID: "+id);
	}
	Student1(String area,int pincode,String branch)
	{
		super(area,pincode);
		System.out.println("Branch of student1: "+branch);
	}
}
class Student2 extends CollegeA
{
	Student2(String name,String name1)
	{
	super(name);
	System.out.println("Student name: "+name1);
	}
	Student2(int code,String id)
	{
		super(code);
		System.out.println("Student ID: "+id);
	}
	Student2(String area,int pincode,String branch)
	{
		super(area,pincode);
		System.out.println("Branch of student1: "+branch);
		System.out.println();
	}
}
public class HierarchialSuperConstructorOverloading 
{
	public static void main(String[] args) 
	{
		Student2 s=new Student2("Gana",24,"Java");
		Student1 a=new Student1("Hamsa",10,"Data science");
	}
}
