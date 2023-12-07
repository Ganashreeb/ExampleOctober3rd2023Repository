package com.sgtesting.TwentyEightOct;
class Parent
{
	Parent(String name,int age)
	{
		System.out.println("Parent Name is: "+name);
		System.out.println("Parent Age is: "+age);
	}
}

class Child1 extends Parent
{
	String name1;
	Child1(String name,int age,String name1)
	{
		super(name,age);
		this.name1=name1;
		System.out.println("Child1 Name is: "+name1);
	}
}

class Child2 extends Parent
{
	String name1;
	Child2(String name,int age,String name1)
	{
		super(name,age);
		this.name1=name1;
		System.out.println("Child2 Name is: "+name1);
	}
}

public class FhierarchialSuperParameterizedConstructor 
{
	public static void main(String[] args) {
	
		Child1 chi=new Child1("Mohan",30,"Kumar");
		System.out.println("  ");
		Child2 chi1=new Child2("Mohan",25,"Sohan");
	}
}