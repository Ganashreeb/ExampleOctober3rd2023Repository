package com.sgtesting.TwentyFirstOct;
class Divisible
{
	int div(int num)
	{
		int sum = 0;
		for(int i=100;i<=200;i++)
		if(i%num==0)
		{
			sum+=i;
		}
		return sum;
	}
}
public class ReturnValueSumThird 
{
	public static void main(String[] args) 
	{
		Divisible d=new Divisible();
		int a=d.div(7);
		System.out.println("Sum of the numbers divisible by 7: "+a);
		
		int b=d.div(9);
		System.out.println("Sum of the numbers divisible by 9: "+b);
	}
}
