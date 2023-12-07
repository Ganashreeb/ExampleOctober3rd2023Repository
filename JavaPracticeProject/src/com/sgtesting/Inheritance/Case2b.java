package com.sgtesting.Inheritance;
//if subclass contains a variable.

class SubClass
{
	SubClass(String name,String location)
	{
		System.out.println("name: "+name);
		System.out.println("location: "+location);
	}
}
class SubClass1 extends SubClass
{
	String bookName;
	SubClass1(String fn,String location,String bookName)
	{
		super(fn,location);
		this.bookName=bookName; //to reuse the bookName we use this keyword
		System.out.println("Book Name: "+bookName);
	}
}
public class Case2b 
{
	public static void main(String[] args) 
	{
		SubClass1 s=new SubClass1("Lion","Jungle","JungleBook");
	}
}
