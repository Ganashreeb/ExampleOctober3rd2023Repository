package com.sgtesting.TwentyFirstOct;
class Count
{
	int countodd()
	{
		int count=0;
		for(int i=150;i<=250;i++)
		{
			if(i%2==1)
			{
				count++;
			}	
		}
		return count;
	}
}
public class ReturnValueCountSecond 
{
	public static void main(String[] args) 
	{
		Count c=new Count();
		int ct=c.countodd();
		System.out.println("count of odd number "+ct);
	}
}
