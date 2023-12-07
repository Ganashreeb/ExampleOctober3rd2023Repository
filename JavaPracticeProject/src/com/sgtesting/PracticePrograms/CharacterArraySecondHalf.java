package com.sgtesting.PracticePrograms;
public class CharacterArraySecondHalf 
{
	public static void main(String[] args) 
	{
		char a[]={'g','a','n','a','g','a','n','a'};
		int i=a.length/2;
		while(i<a.length)
		{
			System.out.println("Second half of array "+a[i]);
			i++;
		}
	}
}
