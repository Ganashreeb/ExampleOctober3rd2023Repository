package com.sgtesting.Inheritance;
// if super class and sub class contains same variable name 
//with same datatype, the subclass vairable hides the superclass variable.

class State
{
	String name;
	void show()
	{
		System.out.println("In super class name value: "+name);
	}
}
class Country extends State
{
	String name;
	Country(String name,String name1)
	{
		super.name=name1;
		this.name=name;
	}
	void display()
	{
		System.out.println("In sub class name value "+name);
	}
}
public class Case5 
{
	public static void main(String[] args) 
	{
		Country c=new Country("karanataka", "Hindusthan");
		c.show();
		c.display();
	}
}
