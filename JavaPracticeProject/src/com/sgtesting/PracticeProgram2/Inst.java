package com.sgtesting.PracticeProgram2;
class Name
{
	String name;
	{
		System.out.println("This is Instance variable");
		System.out.println("-----------------------------------");
	}
}
class Tree
{
	Tree()
	{
		System.out.println("This is Constructor");
		System.out.println("-----------------------------------");
	}
}
class Plant
{
	{
		System.out.println("This is Instance block");
		System.out.println("-----------------------------------");
	}
}
class Animal
{
	static
	{
		System.out.println("This is Static Block");
		System.out.println("-----------------------------------");
	}
}
class Rnd
{
	void Isro()
	{
		System.out.println("This is Instance Method");
		System.out.println("-----------------------------------");
	}
}
public class Inst 
{
	public static void main(String[] args) 
	{
		Name n=new Name();
		Tree t=new Tree();
		Plant p=new Plant();
		Animal a=new Animal();
		Rnd r=new Rnd();
		r.Isro();
	}
}
