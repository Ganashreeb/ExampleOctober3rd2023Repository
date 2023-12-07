package com.sgtesting.TwentyFourOct;
class Demo1
{
	static int[] getaction(int x[])
	{
		int a[]=new int[x.length];
		int k=0;
		for(int i=x.length-1;i>=0;i--)
		{
			a[k]=x[i];
			k++;
		}
		return a;
	}
}
public class ReverseFifth
{
	public static void main(String[] args) 
	{
		int a[]= {55,66,77,88,99};
		int res[]=Demo1.getaction(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}	
	}
}

