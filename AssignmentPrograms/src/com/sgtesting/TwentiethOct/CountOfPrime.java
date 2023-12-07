package com.sgtesting.TwentiethOct;
class PrimeDemo2
{
	void prime() 
	{
		int count=0;
		for(int num=1; num<100; num++) 
		{
			if(num>1) {
			int flag=0;
			for(int i=2; i<num; i++) 
			{
				if(num%i==0) 
				{
					flag=flag+1;
					break;
				}
			}
			if(flag==0) 
			{
				count++;
			}
		}
	}
		System.out.println("Total count :- "+count);
}
}
public class CountOfPrime 
{
	public static void main(String[] args) 
	{
		PrimeDemo2 pd = new PrimeDemo2();
		pd.prime();
	}
}