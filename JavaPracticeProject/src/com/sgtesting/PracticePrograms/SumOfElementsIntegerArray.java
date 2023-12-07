package com.sgtesting.PracticePrograms;
public class SumOfElementsIntegerArray 
{
	public static void main(String[] args) 
	{
		Integer b[]= {900, 10000, 5678, 9805,151997};
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum=sum+b[i];
		}
		System.out.println("the sum of the array is "+sum);
	}

}
