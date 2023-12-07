package com.sgtesting.PracticeProgram2;
/* If a class contains instance block,static block and constructor what is order of execution */

/* order of execution is 
		static block
		instance block
		constructor block
*/

class HelloDemo1
{
	HelloDemo1()
	{
		System.out.println("constructor block");
	}
	{
		System.out.println("instance block");
	}
	static 
	{
		System.out.println("static block");
	}
}
public class InstanceBlockCase1 
{
	public static void main(String[] args) 
	{
		HelloDemo1 h=new HelloDemo1();
	}
}
