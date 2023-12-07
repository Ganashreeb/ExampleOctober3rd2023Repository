package com.sgtesting.ThirtyFirstOct;
abstract class Flower
{
	static void displayCollege() 
	{
		System.out.println("Flowers");
	}
}
class Flower1 extends Flower
{
	 static void displayCollege() 
	{
		System.out.println("CHRYSANTHEMUM, JASMIN, DAISY, PERIVINCLE");
	}
}
public class AbstractStaticMethod 
{
	public static void main(String[] args) 
	{
		Flower.displayCollege();
	}
}
