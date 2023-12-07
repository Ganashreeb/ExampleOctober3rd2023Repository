 package com.sgtesting.FourteenOct;
public class StringTwoDArray 
{
	public static void main(String[] args) 
	{
		String a[][]= {{"anu","manu","thanu"},{"kavya","karan","kumar"},{"gana","avyan","puni"}};
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				s1=s1+" "+a[i][j];			}
		}
		System.out.print(s1);
	}
}
