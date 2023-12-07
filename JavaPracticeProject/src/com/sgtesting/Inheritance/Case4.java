package com.sgtesting.Inheritance;
// If super class and sub class contains same method name 
// with signature(parameter)

class Employee
{
	void showbonus(int percentage)
	{
		double sal,bonus;
		sal=5000;
	    bonus = (sal*percentage)/100;
		System.out.println("bonus of the employee: "+bonus);
	}
}
class Department extends Employee
{
	Department(int percentage)
	{
		super.showbonus(percentage);
	}
	void showbonus(int percentage)
	{
		System.out.println("percentage of bonus for department: "+percentage);
	}
}
public class Case4 
{
	public static void main(String[] args) 
	{
		Department d=new Department(10);
		d.showbonus(5);
	}
}
