package com.sgtesting.TwentiethOct;
class PrimeDemo
{
	void prime() 
	{
		for(int num=250; num>=200; num--) 
		{
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
				System.out.println("Prime No is = "+num);
			}
		}
	}
}

public class PrimeNumbers50to100 {

	public static void main(String[] args) {
		PrimeDemo pd = new PrimeDemo();
		pd.prime();
	}
}