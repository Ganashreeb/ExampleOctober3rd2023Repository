package com.sgtesting.FourteenOct;
public class IntegerArray 
{
	//read 1st row of elements
	public static void main(String[] args) 
	{
		int a[][]= {{90,99,95},{80,89,85},{70,79,75}};
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}

}
