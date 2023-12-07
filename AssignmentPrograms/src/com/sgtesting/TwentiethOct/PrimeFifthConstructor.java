package com.sgtesting.TwentiethOct;
class PrimeNumbers
{
	void prime()
	{ 
		for(int num=250;num>=200;num--)
		{
			int flag=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num+" is a prime number");
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}
		}
	}
}
public class PrimeFifthConstructor 
{
	public static void main(String[] args) 
	{
		PrimeNumbers pn=new PrimeNumbers();
		pn.prime();
	}

}
