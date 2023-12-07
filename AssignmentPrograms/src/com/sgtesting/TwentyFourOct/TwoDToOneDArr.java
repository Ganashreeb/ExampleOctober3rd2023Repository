package com.sgtesting.TwentyFourOct;
class Demo2
{
	static int[] getarray(int x[][])
	{
		int a[]=new int[x.length * x[0].length];
		int k=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
			a[k]=x[i][j];
			k++;	
			}
		}
		return a;
	}
}
public class TwoDToOneDArr 
{
	public static void main(String[] args) 
	{
		int a[][]= {{1,2},{4,5}};
		int res[]=Demo2.getarray(a);
		for(int i=0;i<res.length;i++)
		{
				System.out.print(res[i]+" ");
		}
	}
}
