package com.sgtesting.PracticeProgram2;
/* if a class contains multiple static block what is the order of the execution of static block */

class Test2
{
	static
	{
		System.out.println("this is first static block");
	}
	static
	{
		System.out.println("this is second static block");
	}
	static
	{
		System.out.println("this is third static block");
	}
}
public class StaticBlockCase4 
{
	public static void main(String[] args) 
	{
		Test2 t=new Test2();
	}

}
