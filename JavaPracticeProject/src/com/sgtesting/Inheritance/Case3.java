package com.sgtesting.Inheritance;
//multi-level inheritance order of execution

class AA
{
	AA()
	{
		System.out.println("It is AA's class constructor");
	}
}
class BB extends AA
{
	BB()
	{
		super();
		System.out.println("It is BB's class constructor");
	}
}
class CC extends BB
{
	CC()
	{
		super();
		System.out.println("It is CC'c class constructor");
	}
}
public class Case3 
{
	public static void main(String[] args) 
	{
		CC c=new CC();
	}

}
