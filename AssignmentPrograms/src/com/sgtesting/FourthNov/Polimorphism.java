package com.sgtesting.FourthNov;
abstract class Sports
{
	abstract void showgame();
}
class ThrowBall extends Sports
{
	void showgame()
	{
		System.out.println("ThrowBall");
	}
}
class Kabbadi extends Sports
{
	void showgame()
	{
		System.out.println("Kabbadi");
	}
}
class Archery extends Sports
{
	void showgame()
	{
		System.out.println("Archery");
	}
}
class BasketBall extends Sports
{
	void showgame()
	{
		System.out.println("Basket Ball");
	}
}
class VolleyBall extends Sports
{
	void showgame()
	{
		System.out.println("Volley Ball");
	}	
}
public class Polimorphism 
{
	public static void main(String[] args) 
	{
		Sports s=null;
		ThrowBall throwBall=new ThrowBall();
		Kabbadi  kabbadi=new Kabbadi();
		Archery  archery=new Archery();
		BasketBall  basketBall=new BasketBall();
		VolleyBall volleyBall=new VolleyBall();
		s=throwBall;
		s.showgame();
		s=kabbadi;
		s.showgame();
		s=archery;
		s.showgame();
		s=basketBall;
		s.showgame();
		s=volleyBall;
		s.showgame();
	}
}
