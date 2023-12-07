package com.sgtesting.PracticeProgram;
class CountOdd
{
	int count()
	{
		int count=0;
		for(int i=100;i<=200;i++)
		{
			if(i%2==1)
			{
				count++;
			}
		}
		return count;
	}
}
public class ReturnCountOfOddNumbers 
{
	public static void main(String[] args) 
	{
		CountOdd co=new CountOdd();
		int res=co.count();
		System.out.println("count of odd numbers: "+res);
	}
}
