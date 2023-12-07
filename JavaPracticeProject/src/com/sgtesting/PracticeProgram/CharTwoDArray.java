package com.sgtesting.PracticeProgram;
public class CharTwoDArray 
{
	public static void main(String[] args) 
	{
		char a[][]= {{'m','a','n'},{'a','r','t'},{'s','e','t'},{'p','e','n'}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
