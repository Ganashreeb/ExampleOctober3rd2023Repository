package com.sgtesting.PracticeProgram2;
class Add
{
	int a=10;
	
	Add()
	{
		Mul m=new Mul();
		System.out.println(m.a);
	}
}
class Sub
{
	int a=20;
	void sub()
	{
		Mul m1=new Mul();
		System.out.println(m1.m);
	}
}
class Mul
{
	public char[] m;
	int a=30;
	static void mul()
	{
		Add ad=new Add();
	}
}
public class Cases 
{
	public static void main(String[] args) 
	{
		Sub s=new Sub();
		s.sub();
	}
}
