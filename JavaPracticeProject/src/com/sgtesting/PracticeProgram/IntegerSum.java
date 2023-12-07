package com.sgtesting.PracticeProgram;
class DemoReturn
{
	int[] sumof(int arr[])
	{
		int s[]=new int[arr.length];
		int n=0,sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+i;
		}
		return s;
	}
}
public class IntegerSum 
{
	public static void main(String[] args) 
	{
		DemoReturn d=new DemoReturn();
		int r[]= {112,111,10,99,88,77,66};
		int ret[]=d.sumof(r);
		for(int i=0;i<ret.length;i++)
		{
		System.out.println(ret);
		}
	}
}
