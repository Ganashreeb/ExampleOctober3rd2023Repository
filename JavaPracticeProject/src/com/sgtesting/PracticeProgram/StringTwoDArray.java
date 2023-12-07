package com.sgtesting.PracticeProgram;
public class StringTwoDArray 
{
	public static void main(String[] args) 
	{
		String a[][]= {{"gana","avyan","punith"},{"soma","manu","thanu"},{"sona","mona","aishu"}};
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
