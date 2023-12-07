package com.sgtesting.TwentyFourOct;
class Addition
{
	static int[] getadd(int x[], int y[])
	{
		int a[]=new int[x.length];
		int k=0;
		if(x.length==y.length)
		{
			for(int i=0;i<x.length;i++)
			{
				a[k]=x[i]+y[i];
				k++;
			}
		}
		return a;
	}
}
public class AdditionReturn 
{
	public static void main(String[] args) 
	{
		int c[]= {2,3,4,5,6,7,8};
		int b[]= {2,3,4,5,6,7,8};
		int res[]=Addition.getadd(c,b);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
}