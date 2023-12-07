package com.sgtesting.Inheritance;
class College
{
	College(String collname)
	{
		System.out.println("college name: "+collname);
	}
	College(int collegecode)
	{
		System.out.println("college code: "+collegecode);
	}
}
class Student1 extends College
{
	String Studname;
	Student1(String collname,String Studname)
	{
		super(collname);
		this.Studname=Studname;
		System.out.println("student name: "+Studname);
	}
	Student1(int collegecode,int studentid)
	{
		super(collegecode);
		System.out.println("student ID: "+studentid);
	}
}
class Lib extends Student1
{
	Lib(String collname,String Studname,String Libname)
	{
		super(collname,Studname);
		System.out.println("Library name "+Libname);
	}
	Lib(int collegecode,int studentid,int libcode, int libid)
	{
		super(collegecode,studentid);
		System.out.println("Library code: "+libcode);
		System.out.println("Library Id: "+libid);
	}
}
public class MultilevelSuperclassConstructorOverloading 
{
	public static void main(String[] args) 
	{
		Lib l=new Lib("KLE", "Gana", "KLE library");
		Lib l1=new Lib(1605, 1024, 9458, 1124);
	}
}
