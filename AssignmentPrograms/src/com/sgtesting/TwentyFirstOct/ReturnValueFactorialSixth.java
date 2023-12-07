package com.sgtesting.TwentyFirstOct;
class Factorial
{
	int facto(int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class ReturnValueFactorialSixth 
{
	public static void main(String[] args) 
	{
		Factorial f=new Factorial();
		int fact=f.facto(10);
		System.out.println("factorial of a number: "+fact);
	}

}
