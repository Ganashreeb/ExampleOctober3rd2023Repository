package com.sgtesting.PracticeProgram2;
//There is a class it has static variables,static methods,find out the execution order of static members.
class Stud
{
	static String firstName;
	static int age;
	static
	{
		firstName="Gana";
		age=26;
		showFn();
		showAge();
	}
	static void showFn() 
	{
		System.out.println("first name: "+firstName);
	}
	static void showAge()
	{
		System.out.println("age: "+age);
	}
}
public class StaticBlockCase1 
{
	public static void main(String[] args) 
	{
		Stud.age=21;
		System.out.println("age in main method: "+Stud.age);
	}
}
