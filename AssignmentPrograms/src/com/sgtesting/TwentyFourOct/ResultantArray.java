package com.sgtesting.TwentyFourOct;
class Demo
{
	static int[] getArray(int x[],int y[])
	{
		int a[]=new int[x.length+y.length];
		int k=0;
		for(int i=0;i<x.length;i++)
			{
				a[k]=x[i];
				k++;
			}
		for(int j=0;j<y.length;j++)
		{
			a[k]=y[j];
			k++;
		}
		return a;
	}
}
public class ResultantArray 
{
	public static void main(String[] args) 
	{
		int a[]= {9,8,7,6,5,4};
		int b[]= {5,4,3,2,1,0};
		int res[]=Demo.getArray(a, b);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
}
