package com.sgtesting.PracticeProgram2;
/* there is 2 class demo1 and demo2,demo1 contains instance method 
 demo2 contains static method, call instance method of demo1 
 in static method. */
class Demo1
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("addition "+res);
	}
}
class Demo2
{
	static void multiplication(int x,int y)
	{
		//creating obj(d) for instace method
		Demo1 d=new Demo1();  
		//calling instance method in static method (obj.method name)
		d.addition(13, 13);   
		int res=(x*y);
		System.out.println("multiplication "+res);
	}
}
public class Case3 
{
	public static void main(String[] args) 
	{
		Demo2 demo2 = new Demo2();
		demo2.multiplication(15, 15);
	}
}
