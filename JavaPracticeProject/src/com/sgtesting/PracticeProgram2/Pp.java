package com.sgtesting.PracticeProgram2;
class Addition
{
	int a=10;
	static int b=20;
	Addition()
	{
		Multiplication m=new Multiplication();
		System.out.println(m.a);
		System.out.println(Multiplication.b);
	}
}
class Multiplication
{
	int a=90;
	static int b=40;
	void mul()
	{
		Addition ad=new Addition();
		System.out.println(ad.a);
		System.out.println(Addition.b);
	}
}
public class Pp 
{
	public static void main(String[] args) 
	{
		Multiplication m=new Multiplication();
		m.mul();
		//Addition add=new Addition();
	}
}
