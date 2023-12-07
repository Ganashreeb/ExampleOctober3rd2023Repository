package com.sgtesting.ThirdNov;
abstract class Degree
{
	Degree(String name)
	{
		System.out.println("Degree "+name);
	}
}
interface University1
{
	void showUniversityName(String name);
}
interface College1
{
	 void displayCollegeName(String name);
}
interface Pucollege1
{
	void displayPuCollegeName(String name);
}
class BmsEngineering1 extends Degree implements University,College,Pucollege
{
	BmsEngineering1(String name) 
	{
		super(name);
	}
	public void showUniversityName(String name)
	{
		System.out.println("university name: "+name);
	}
	public void displaycollegename(String name)
	{
		System.out.println("college name: "+name);
	}
	public void displayPuCollegeName(String name)
	{
		System.out.println("PU college name: "+name);
	}
	void displaylocation(String location)
	{
		System.out.println("location of engineering college: "+location);
	}
	
	public void displayCollegeName(String name) 
	{
		System.out.println();
	}
}
public class Bmultipleinheritanceabstract 
{
	public static void main(String[] args) 
	{
		BmsEngineering1 b=new BmsEngineering1("MCA");
		b.showUniversityName("vtu");
		b.displaycollegename("Kle college");
		b.displaylocation("Bangalore");
		b.displayPuCollegeName("RNS college");
	}
}
