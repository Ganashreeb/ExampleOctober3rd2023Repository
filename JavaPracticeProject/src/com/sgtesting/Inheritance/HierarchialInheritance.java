package com.sgtesting.Inheritance;
class Math
{
	void addition(int x,int y)
	{
		System.out.println("add: "+(x+y));
	}
}
class Math1 extends Math
{
	void subtraction(int x,int y)
	{
		System.out.println("subtraction: "+(x-y));
	}
}
class Math2 extends Math
{
	void multiplication(int x,int y)
	{
		System.out.println("multiplication: "+(x*y));
	}
}
public class HierarchialInheritance 
{
	public static void main(String[] args) 
	{
		Math2 m=new Math2();
		m.addition(16, 10);
		m.multiplication(30, 40);
		Math1 m1=new Math1();
		m1.addition(30, 50);
		m1.subtraction(69, 39);
	}
}
