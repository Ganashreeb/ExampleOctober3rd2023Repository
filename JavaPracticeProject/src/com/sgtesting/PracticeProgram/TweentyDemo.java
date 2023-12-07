package com.sgtesting.PracticeProgram;
class Bdemo
{
	Bdemo(byte b[][])
	{
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class TweentyDemo
{
	public static void main(String[] args) 
	{
		byte a[][]= {{9,6,3},{2,4,6},{1,3,5}};	
		Bdemo de=new Bdemo(a);
	}	
}
