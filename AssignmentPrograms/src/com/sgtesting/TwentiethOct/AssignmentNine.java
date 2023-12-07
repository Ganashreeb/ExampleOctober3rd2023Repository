package com.sgtesting.TwentiethOct;

class IntergerDemo {
	void Demo(int a[][]) {
		int b[] = new int[a.length * a[0].length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i] = a[1][i];
		}
		for (int j = 0; j < a[1].length; j++)
		{

			System.out.print(b[j]+" ");
		}
	}
}

public class AssignmentNine 
{
	public static void main(String[] args) 
	{
		IntergerDemo id = new IntergerDemo();
		int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		id.Demo(x);
	}
}