package com.sgtesting.ThirdNov;
interface Univers
{
	void showuniversityname(String name);
}
interface Coll1 extends Univers
{
	abstract void displaycoll1name(String name);
}
interface Coll2 extends Univers
{
	abstract void displaycoll2name(String name);
}
class Klecoll implements Coll1,Coll2
{
	public void displayshowuniversityname(String name)
	{
		System.out.println("University name: "+name);
	}
	public void displaycoll1name(String coll)
	{
		System.out.println("College1 name: "+coll);
	}
	public void displaycoll2name(String coll2)
	{
		System.out.println("College2 name: "+coll2);
	}
	void displaylocation(String loc)
	{
		System.out.println("Location of college: "+loc);
	}
	public void showuniversityname(String name) 
	{
		System.out.println("name: "+name);
	}
	public void displaycollname(String name) 
	{
		System.out.println("name: "+name);
	}
}
public class DHierarchyOneinterfaceextendsanother 
{
	public static void main(String[] args) 
	{
		Klecoll k=new Klecoll();
		k.displayshowuniversityname("Vtu");
		k.displaycoll1name("KLE College");
		k.displaycoll2name("Vishweshwaraiah college");
		k.displaylocation("Belagam");
	}
}
