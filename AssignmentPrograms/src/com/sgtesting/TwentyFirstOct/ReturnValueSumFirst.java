package com.sgtesting.TwentyFirstOct;
class Sum1
{
	int sumof()
	{
		int sum=0, num = 20;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		return sum;	
	}
}
public class ReturnValueSumFirst 
{
	public static void main(String[] args) 
	{
		Sum1 s=new Sum1();
		int sum=s.sumof();
		System.out.println("sum of first 20 numbers: "+sum);
	}
}

