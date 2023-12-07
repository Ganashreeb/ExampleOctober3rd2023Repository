package com.sgtesting.PracticeProgram2;
class Outer
{
	String name;
	Inner inner=new Inner();
	void displayAge()
	{
		inner.age=26;
		System.out.println("Age: "+inner.age);
	}
}
class Inner
{
	int age;
	void showFn()
	{
		String name = "Gana";
		System.out.println("Name: "+name);
	}
}
public class InnerOuterClass
{
	public static void main (String[] args)
	{
		Outer o=new Outer();
		o.displayAge();
		o.inner.showFn();
	}
}


/*
class Outer
{
	String firstName;
	Inner inner=new Inner();
	void DisplayAge()
	{
		inner.age=21;
		System.out.println("Age: "+inner.age);
	}
	class Inner
	{
		int age;
		void showFN()
		{
			firstName="gana";
			System.out.println("first name: "+firstName);
		}
	}
}
public class InnerOuterClass 
{
	public static void main(String[] args) 
	{
		Outer outer=new Outer();
		outer.DisplayAge();
		outer.inner.showFN();
	}
}
 */