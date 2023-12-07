package com.sgtesting.PracticeProgram2;
class Grandparent
{
	void displayinfo(String name,int age)
	{
		System.out.println("Grandparent Name is: "+name);
		System.out.println("Age: "+age);
	}
}

class Parent1 extends Grandparent
{
	Parent1(String name, int age)
	{
		super.displayinfo(name, age);
	}
	
	void displayinfo(String name1,String age)
	{
		System.out.println("Parent name: "+name1);
		System.out.println("Age: "+age);
	}
}

class Child extends Parent1
{
	Child(String name,int age)
	{
		super(name, age); 
		super.displayinfo(name, age);
	}
	
	void displayinfo(String name, int age)
	{
		System.out.println("Child Name: "+name);
		System.out.println("Age: "+age);
	}
}

public class HmultilevelSameMethodSameSignature 
{
	public static void main(String[] args) 
	{	
		Parent1 p=new Parent1("Kumar", 60);
		p.displayinfo("Sohan", 29);
		
		Child c=new Child("Mohan", 78);
		c.displayinfo("Sohan", 21);	
	}
}