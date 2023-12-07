package com.sgtesting.PracticeProgram2;
class Demo
{
	Demo()
	{
		System.out.println("constructor");
	}
}
class Demoaa
{
	static void show()
	{
		System.out.println("hello");
	}
}
public class NewProgram 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		Demoaa.show();
	}
}
