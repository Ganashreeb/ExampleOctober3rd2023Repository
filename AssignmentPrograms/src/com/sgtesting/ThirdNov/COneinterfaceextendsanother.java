package com.sgtesting.ThirdNov;
interface Univer
{
	void showunivername(String name);
}
interface Coll extends Univer
{
	abstract void showcollname(String name);
}
class Klecollege implements Coll
{
	public void showunivername(String name) 
	{
		System.out.println("University name: "+name);
	}
	public void showcollname(String coll) 
	{
		System.out.println("coll name: "+coll);
	}
	void displaylocation(String loc)
	{
		System.out.println("location of college: "+loc);
	}
}
public class COneinterfaceextendsanother 
{
	public static void main(String[] args) 
	{
		Klecollege k=new Klecollege();
		k.showunivername("VTU");
		k.showcollname("Kle college");
		k.displaylocation("Belgum");
	}
}
