package com.sgtesting.PracticeProgram;
class BooleanDemo
{
	boolean[] fun(boolean arr[])
	{
		boolean[] a=new boolean[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			a[k]=arr[i];
			k++;
		}
		return a;
	}
}
public class BoolArr 
{
	public static void main(String[] args) 
	{
		BooleanDemo bd=new BooleanDemo();
		boolean b[]= {true,false,false,true};
		boolean[] bo=bd.fun(b);
	    for(int i=0;i<b.length;i++)
	    {
	    	System.out.println(bo[i]);
	    }
	}
}
