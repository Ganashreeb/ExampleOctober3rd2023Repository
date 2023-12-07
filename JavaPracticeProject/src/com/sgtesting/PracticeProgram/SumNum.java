package com.sgtesting.PracticeProgram;
//sum of numbers divisible by 7
class DemoSum
{
	int div7(int a , int b)
	{
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			if(i%7==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class SumNum 
{
	public static void main(String[] args) 
	{
		DemoSum ds=new DemoSum();
		int res=ds.div7(100,200);
		System.out.println(res);
	}
}
