package com.sgtesting.TwentyEightOct;
class Employee
{
	void showBonus(int percentage)
	{
		double sal,showBonus;
		sal=5000;
		showBonus=(sal*percentage)/100;
		System.out.println("Show Bonus: "+showBonus);
	}
}
class Department extends Employee
{
	Department(int percentage)
	{
		super.showBonus(percentage);
	}
	void showBonus(int percentage)
	{
		System.out.println("percentage of bonus for Department: "+percentage);
	}
}
class Department1 extends Department
{

	Department1(int percentage,int percentage1) 
	{
		super(percentage);
		super.showBonus(percentage1);
	}
	void showBonus(int percentage)
	{
		System.out.println("percentage of bonus for Department1: "+percentage);
	}
}
public class HmulitilevelSameMethodNameWithSignature 
{
	public static void main(String[] args) 
	{
		Department1 d=new Department1(10,10);
		d.showBonus(20);	
	}
}
