package com.sgtesting.FourteenOct;
public class IntegerModulusArray 
{
	public static void main(String[] args) 
	{
		int a[][]= {{9,1,5},{8,5,2},{3,7,6}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				{
				int b= a[i][j]%2;
					System.out.print(b+" ");
				}
			System.out.println();
		}
	}
}
