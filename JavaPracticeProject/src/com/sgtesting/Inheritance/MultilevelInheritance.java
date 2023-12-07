package com.sgtesting.Inheritance;
class Maths
{
	void addition(int x,int y)
	{
		System.out.println("addition: "+(x+y));
	}
}
class Maths1 extends Maths
{
	void subtraction(int x,int y)
	{
		System.out.println("subtraction: "+(x-y));
	}
}
class Maths2 extends Maths1
{
	void multiplication(int x,int y)
	{
		System.out.println("multiplication: "+(x*y));
	}
}
public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		Maths2 m=new Maths2();
		m.addition(55, 90);
		m.subtraction(77, 45);
		m.multiplication(30, 80);
	}
}
