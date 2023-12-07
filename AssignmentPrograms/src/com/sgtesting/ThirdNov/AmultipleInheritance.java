package com.sgtesting.ThirdNov;
interface University
{
	void showUniversityName(String name);
}
interface College
{
	 void displayCollegeName(String name);
}
interface Pucollege
{
	void displayPuCollegeName(String name);
}
class BmsEngineering implements University,College,Pucollege
{
	public void showUniversityName(String name)
	{
		System.out.println("university name: "+name);
	}
	public void displayCollegeName(String name)
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
}
public class AmultipleInheritance 
{
	public static void main(String[] args) 
	{
		BmsEngineering b=new BmsEngineering();
		b.showUniversityName("vtu");
		b.displayCollegeName("Kle college");
		b.displaylocation("Bangalore");
		b.displayPuCollegeName("RNS college");
	}
}
