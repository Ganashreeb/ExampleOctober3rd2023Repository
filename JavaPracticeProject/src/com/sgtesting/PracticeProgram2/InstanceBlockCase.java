package com.sgtesting.PracticeProgram2;
//Instance block contains only body it does not have any name.

//Limitation of instance block : - We can not pass any parameters

class HelloDemo
{
	{
		System.out.println("Instance block");
	}
}
public class InstanceBlockCase 
{
	public static void main(String[] args) 
	{
		HelloDemo a=new HelloDemo();
	}
}
