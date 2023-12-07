package com.sgtesting.TwentyEightOct;
class Student
{
	Student(int x,int y)
	{
		System.out.println("Addition: "+(x+y));
		System.out.println("Substration: "+(x-y));
	}
}
class Library extends Student
{
	 Library(int a, int b) 
	 {
		 super(a,b);
	}	
}
class Lab extends Library
{
	Lab(int x,int y,int i,int j)
	{
		super(x,y);
	}
}
public class DmultilevelSuperClassParameterizedConstructor 
{
	public static void main(String[] args) 
	{
		Library l=new Library(24,6);
		Lab b=new Lab(3,8, 5, 8);
	}
}
