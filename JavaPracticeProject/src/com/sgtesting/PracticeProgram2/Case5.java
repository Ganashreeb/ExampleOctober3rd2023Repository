package com.sgtesting.PracticeProgram2;
/* there are 2 class demo1 and demo2.
   Demo1 contains static method demo2 also contains static methods, 
   call demo1 static method in demo 2 static method
*/
class dem
{
	static void add(int x,int y)
	{
		int res=(x+y);
		System.out.println("addition result: "+res);
	}
}
class dem1
{
	static void sub(int x,int y)
	{
		dem.add(44, 38);
		int res=(x-y);
		System.out.println("subtraction result: "+res);
	}
}
public class Case5 
{
	public static void main(String[] args) 
	{
		dem1.sub(50, 20);
	}

}
