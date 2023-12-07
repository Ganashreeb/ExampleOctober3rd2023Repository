package com.sgtesting.FourteenOct;
public class LongSumOfAllElements 
{
	public static void main(String[] args)
	{
		long sum=0;
		long a[][] = {{2,3,4},{5,6,7},{8,9,10}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[i][j];    
			}
		}
		System.out.println(sum);	
	}
}
