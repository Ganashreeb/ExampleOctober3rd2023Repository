package com.sgtesting.PracticeProgram2;
/*  there are 2 classes demo1 & demo2. demo1 instance method demo2 
    contains static method, call static method of demo2 in instance 
    method of demo1.
*/
class Demonstration
{
	void addition(int x,int y)
	{
		// calling static method without creating obj directly 
		// in instance method (classname.methodname)
		Demonstration1.multiplication(20, 30);
		int res=(x+y);
		System.out.println("addition: "+res);
	}
}
class Demonstration1
{
	static void multiplication(int x,int y)
	{
	int res=(x*y);
	System.out.println("multiplication: "+res);
	}
}
public class Case4 
{
	public static void main(String[] args) 
	{
		Demonstration d=new Demonstration();
		d.addition(10, 50);
	}
}
