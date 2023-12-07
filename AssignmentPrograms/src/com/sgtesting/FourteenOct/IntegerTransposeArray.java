package com.sgtesting.FourteenOct;
public class IntegerTransposeArray 
{
	public static void main(String[] args) 
	{
		int a[][]= {{10,11,12},{13,14,15},{16,17,18}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				  System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
