package com.sgtesting.FourteenOct;
public class ByteTwoDArray 
{
	public static void main(String[] args) 
	{
		byte b[][]= {{1,2,3},{4,4,4},{5,6,7}};
		int i=0;
		while(i<b.length)
		{
			int j=0;
			while(j<b.length)
		    {
			  System.out.print(b[i][j]+" ");
			  j++;
		    }
			i++;
			System.out.println();
		}
	}
}
