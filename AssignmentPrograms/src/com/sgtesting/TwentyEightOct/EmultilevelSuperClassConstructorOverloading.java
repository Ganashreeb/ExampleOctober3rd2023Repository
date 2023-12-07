package com.sgtesting.TwentyEightOct;
class College
{
	College(String name)
	{
		System.out.println("College name: "+name);
	}
	
	College(int code)
	{
		System.out.println("College Code: "+code);
	}
	
	College(String location,int pincode)
	{
		System.out.println("College Location: "+location);
		System.out.println("Pincode: "+pincode);
	}
}

class Student1 extends College
{
	Student1(String name)
	{
		super(name);
	}
	
	Student1(int code)
	{
		super(code);
	}
	
	Student1(String location,int pincode)
	{
		super(location,pincode);
	}
}

class Library1 extends Student1
{
	Library1(String name)
	{
		super(name);
	}
	
	Library1(int code)
	{
		super(code);
	}
	
	Library1(String location,int pincode)
	{
		super(location,pincode);
	}
}

public class EmultilevelSuperClassConstructorOverloading 
{
	public static void main(String[] args) 
	{
		Library1 lib=new Library1("KLE");
		Library1 lib1=new Library1(345);
		Library1 lib2=new Library1("bangalore",560072);
	}
}