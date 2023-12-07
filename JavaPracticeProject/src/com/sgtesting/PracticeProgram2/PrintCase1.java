package com.sgtesting.PracticeProgram2;
//case1 rule 1: if instance members cannot be accessed directly in a static method or 
//static block of the same class.

//case1 rule 2: the static members can be directly accessed in a static methods or 
//static block of the same class
public class PrintCase1 
{
	static String name;
	static int age;
	public static void main(String[] args) 
	{
		int age = 26;
		String name = "Gana";
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
