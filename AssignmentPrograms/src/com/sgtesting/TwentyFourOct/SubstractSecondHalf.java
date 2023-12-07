package com.sgtesting.TwentyFourOct;
class Substraction
{
	static int[] getsubstraction(int x[],int y[])
	{
		int a[]=new int[x.length];
		int k=0;
		if(x.length==y.length)
		{
			for(int i=x.length/2;i<x.length;i++)
			{
				a[k]=x[i]-y[i];
				k++;
			}
		}
		return a;
	}
}
public class SubstractSecondHalf 
{
	public static void main(String[] args) 
	{
		int a[]= {4,6,8,10,12,13};
		int b[]= {1,2,3,4,5,6};
		int res[]=Substraction.getsubstraction(a,b);
		for(int i=0;i<res.length/2;i++)
		{
			System.out.print(res[i]+" ");
		}
	}

}
