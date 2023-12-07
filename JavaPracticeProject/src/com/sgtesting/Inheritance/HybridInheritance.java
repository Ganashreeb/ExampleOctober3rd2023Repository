package com.sgtesting.Inheritance;
class Operations
{
	void addition(int x,int y)
	{
		System.out.println("addition: "+(x+y));
	}
}
class Operations1 extends Operations
{
	void substraction(int x,int y)
	{
		System.out.println("substraction: "+(x-y));
	}
}
class Operations2 extends Operations
{
	void multiplication(int x,int y)
	{
		System.out.println("multiplication: "+(x*y));
	}
}
class Operations3 extends Operations2
{
	void division(int x,int y)
	{
		System.out.println("division: "+(x/y));
		System.out.println("++++++++++++++++++++++++++");
	}
}
public class HybridInheritance 
{
	public static void main(String[] args) 
	{
		Operations3 o=new Operations3();
		o.addition(45, 45);
		o.multiplication(34, 34);
		o.division(89, 49);
		Operations1 op=new Operations1();
		op.addition(24, 98);
		op.substraction(67, 24);
	}
}
