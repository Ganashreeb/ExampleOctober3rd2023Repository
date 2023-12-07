package com.sgtesting.TwentyEightOct;
class Plants
{
	void producer()
	{
		System.out.println("Food Producer");
	}
}
class Herbivores extends Plants
{
	void dis()
	{
		System.out.println("Grasshopper, Deer - Primary consumer");
	}
}
class PrimaryCarnivores extends Plants
{
	void disp()
	{
		System.out.println("Rat, Snake - Secondary consumer");
	}
}
class SecondaryCarnivores extends PrimaryCarnivores
{
	void display()
	{
		System.out.println("Eagle, Tiger - Tertiary Consumer");
	}
}
public class Chybrid 
{
	public static void main(String[] args) 
	{
		Herbivores h=new Herbivores();
		h.producer();
		h.dis();
		SecondaryCarnivores s=new SecondaryCarnivores();
		s.producer();
		s.disp();
		s.display();
	}
}
