package com.sgtesting.Inheritance;
class Student
{
	Student(String fname,String location)
	{
		System.out.println("name: "+fname);
		System.out.println("location: "+location);
	}
}
class Library extends Student
{
	Library(String fn,String place)
	{
		super(fn,place);
	}
}
public class Case2a 
{
	public static void main(String[] args) 
	{
		Library a=new Library("gana","bangalore");
	}
}
