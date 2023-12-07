package com.sgtesting.PracticeProgram2;
// if we can write multiple instance block what is the order of execution

class HelloDemo2
{
	{
		System.out.println("1st instance block");
	}
	{
		System.out.println("2nd instance block");
	}
	{
		System.out.println("3rd instance block");
	}
}
public class InstanceBlockCase2 
{
	public static void main(String[] args) 
	{
		HelloDemo2 h=new HelloDemo2();
	}
}
