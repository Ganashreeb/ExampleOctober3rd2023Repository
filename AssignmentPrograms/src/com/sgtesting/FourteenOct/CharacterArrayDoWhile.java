package com.sgtesting.FourteenOct;
//2x3 matrix
public class CharacterArrayDoWhile 
{
	public static void main(String[] args) 
	{
		char a[][]= {{'s','o','n'},{'o','a','t'}};
		{
		int i=0;
		do
		{
			int j=0;
			do
			{
			System.out.print(a[i][j]+" ");
			j++;
		    }
		    while(j<=a[i].length-1);
		    System.out.println();
		    i++;
}
	while(i<=a.length-1);
  }
}
}