package com.sgtesting.PracticeProgram;
class FirstArrayElements
{
	String fruits()
	{
		String a[]= {"Apple","Mango","Orange","Pineapple"};
		return a[0];
	}
}
public class FirstElement 
{
	public static void main(String[] args) 
	{
		FirstArrayElements fr=new FirstArrayElements();
		System.out.println(fr.fruits());
		
	}

}
