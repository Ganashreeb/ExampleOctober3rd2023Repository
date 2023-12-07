package com.sgtesting.PracticeProgram2;
class Maths1
{
	void addition(int x,int y)
	{
		System.out.println("addition: "+(x+y));
	}
}
class Maths2 extends Maths1
{
	void subtraction(int a,int b)
	{
		System.out.println("substraction: "+(a-b));
	}
}
class  Maths3 extends Maths1
{
	void division(int x,int y)
	{
		System.out.println("division: "+(x/y));
	}
}
public class HierarchialBasic 
{
	public static void main(String[] args) 
	{
		Maths3 m=new Maths3();
		m.addition(20, 50);
		m.division(90, 20);
		
		Maths2 a=new Maths2();
		a.subtraction(20, 10);
		a.subtraction(600, 450);
	}

}
