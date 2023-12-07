package com.sgtesting.PracticeProgram;
//write double array and read the elements
class DoubleArray
{
	double[] read(double arr[])
	{
		return arr;
	}
	
}
public class DoubleReturn 
{
	public static void main(String[] args) 
	{
		double a[]= {1.2,1.3,1.4,1.5,1.6};
		DoubleArray da=new DoubleArray();
		double[] res=da.read(a);
		for(int i=0;i<res.length;i++)
		{
		System.out.println(res[i]+" ");
		}
	}

}
