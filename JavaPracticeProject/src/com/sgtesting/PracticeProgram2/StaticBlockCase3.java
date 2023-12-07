package com.sgtesting.PracticeProgram2;
/*  if a class contains a block or constructor in this case which will execute first*/

// static block executes first and then no args constructor will execute

class Test1
{
	Test1()
	{
		System.out.println("no args constructor");
	}
	static
	{
		System.out.println("this is static block");
	}
}
public class StaticBlockCase3 
{
	public static void main(String[] args) 
	{
		Test1 t=new Test1();
	}

}
