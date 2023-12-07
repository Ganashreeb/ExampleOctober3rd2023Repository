package com.sgtesting.PracticeProgram2;
// whether static method can return a value 

/* for the given 1d array the method should return sum of all elements */

class Calculation
{
	static int getSumOfElements(int s[])
	{
		int sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[i];
		}
		return sum;
	}
}
public class StaticBlockCase5 
{
	public static void main(String[] args) 
	{
		int a[]= {2,4,6,8,10,12,14,16,18,20};
		int res=Calculation.getSumOfElements(a);
		System.out.println(res);
	}

}
