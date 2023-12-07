package com.sgtesting.PracticeProgram;
public class PrintNumAndInReverse 
{
	public static void main(String[] args) 
	{
		int x,y;
		//for(x=1, y=100; x<=100 && y>=1; x++,y--) 
		for(int i=1; i<=100;i++)
		{
			int j=101-i;
			System.out.println(i+" "+j);
		}
	}
}
