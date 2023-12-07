package com.sgtesting.PracticeProgram;
class NativeResult
{
	String[] place(String arr[]) 
	{
		return arr;
	}
}
public class Third 
{
	public static void main(String[] args) 
	{
		NativeResult n=new NativeResult();
		String a[]= {"Bangalore"};
		String res[]=n.place(a);
		for(int i=0;i<res.length;i++)
		{
		System.out.println(res[i]);
		}
	}
}
 