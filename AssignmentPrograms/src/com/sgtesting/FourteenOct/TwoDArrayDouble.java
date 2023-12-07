package com.sgtesting.FourteenOct;
public class TwoDArrayDouble 
{
	public static void main(String[] args) 
	{
		double a[][] = {{435.980,87.09,0.987},{45.98,6.78655,65.889},{16.45,3.455,45.74}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
		     System.out.print(a[i][j]+"   ");	 
			}
			System.out.println();
	    }
	}
}
