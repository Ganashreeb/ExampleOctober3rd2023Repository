package com.sgtesting.ThirdNov;
interface Add 
{
	int a = 10;
	int b = 20;
	void add();
}
interface Sub 
{
	int a = 30;
	int b = 5;
	void sub();
}
class Maths implements Add, Sub 
{
	public void add() 
	{
		int c = Add.a + Add.b;
		System.out.println("Addition = " + c);
	}
	public void sub() 
	{
		int c = Sub.a + Sub.b;
		System.out.println("Substraction = " + c);
	}
}
public class EInterfacecontainvariables 
{
	public static void main(String[] args) 
	{
		Maths m = new Maths();
		m.add();
		m.sub();
	}
}
