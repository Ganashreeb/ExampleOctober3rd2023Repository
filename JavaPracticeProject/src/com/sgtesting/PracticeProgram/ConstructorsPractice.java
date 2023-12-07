package com.sgtesting.PracticeProgram;
public class ConstructorsPractice 
{
	public static void main(String[] args) 
	{
		String s[]= {"10","20","30","40","50"};
		int sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+Integer.parseInt(s[i]);
		}
		System.out.println(sum);
	}
}

