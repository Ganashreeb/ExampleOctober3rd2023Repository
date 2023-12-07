package com.sgtesting.PracticeProgram2;
/* there are 2 class demo1 and demo2 .demo 1 class contains instance method. Demo2 class contains 
 instance method. Execute instance method of demo2 inside the instance method of class demo1.
 */
class Demo3
{
	void addition(int x,int y)
	{
		Demo4 d=new Demo4();
		d.multiplication(20,10);
		int res=(x+y);
		System.out.println("addition result: "+res);
	}
}
class Demo4
{
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication: "+res);
	}
}
public class Case6 
{
	public static void main(String[] args) 
	{
		Demo3 d=new Demo3();
		d.addition(20, 30);;
	}
}
