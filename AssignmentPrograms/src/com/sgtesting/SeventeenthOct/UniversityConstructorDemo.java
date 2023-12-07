package com.sgtesting.SeventeenthOct;
class University
{
	University(int noofuni)
	{
		System.out.println("number of universities: "+noofuni);
	}
	University(String univ)
	{
		System.out.println("university name: "+univ);
	}
	University(int cutoff,String college )
	{
		System.out.println("College Name: "+college);
		System.out.println("cutoff - ranking: "+cutoff);
	}
}
public class UniversityConstructorDemo 
{
	public static void main(String[] args) 
	{
		University uni=new University(889);
		University univ=new University("Bangalore university");
		University un=new University(999,"KLE college");
	}

}
