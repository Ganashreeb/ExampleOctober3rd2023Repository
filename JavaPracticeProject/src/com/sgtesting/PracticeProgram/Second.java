package com.sgtesting.PracticeProgram;
class IntegerArray
{
	int[][] numbers(int b[][])
	{
		return b;
	}
}
public class Second {

	public static void main(String[] args) 
	{
		IntegerArray obj=new IntegerArray();
		int a[][]= {{1,2},{3,4},{5,6}};
		int res[][]=obj.numbers(a);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
			System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
