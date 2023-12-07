package com.sgtesting.PracticePrograms;
public class FloatArrayWhileLoop 
{
	public static void main(String[] args) 
	{
		float a[]={29.0f, 5.000f, 0.567f, 5.555f, 67.09f, 43.566f};
		int i=a.length/2;
		while(i<a.length)
		{
			System.out.println("Second half of array "+a[i]);
			i++;
		}
	}
}
