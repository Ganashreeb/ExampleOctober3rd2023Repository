package com.sgtesting.PracticeProgram;
class FlSec
{
	float [] oat(float [] arr)
	{
		float [] m=new float [arr.length] ;
		int w=0;
		for(int i=arr.length/2;i<arr.length;i++)
		{
			m[w]=arr[i];
			w++;
		}
		return m;
	}
}
public class FloatSecondHalf 
{
	public static void main(String[] args)
	{
		FlSec on1=new FlSec();
		float a[]= {21.1f,21.2f,21.3f,21.4f,21.5f,21.6f};
		float t[]=on1.oat(a);
		for(int i=0;i<t.length;i++)
		{			
			System.out.println(t[i]);
		}
	}
}
