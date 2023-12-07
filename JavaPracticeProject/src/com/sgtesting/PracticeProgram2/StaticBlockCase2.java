package com.sgtesting.PracticeProgram2;
/* If a class contains static block alone how to execute the static block */
class Test
{
	static 
	{
		System.out.println("This is  static block");
	}
}
public class StaticBlockCase2 
{
	public static void main(String[] args) 
	{
		Test t=new Test();
	}
}
