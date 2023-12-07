package com.sgtesting.PracticePrograms;
public class LongArrayDoWhile 
{
	public static void main(String[] args) 
	{	
		long a[]= {23000000, 5875447, 58765446, 78765548, 9876580, 900865424};
		int i=a.length/2;
		do 
		{
			System.out.println("Second half of array do while "+a[i]);
			i++;
		}
		while(i<a.length);
	}

}
