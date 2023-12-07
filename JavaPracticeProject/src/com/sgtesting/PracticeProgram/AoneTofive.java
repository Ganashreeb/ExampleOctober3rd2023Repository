package com.sgtesting.PracticeProgram;
class Fivequestions
{
	int[] even()
	{
		int a[]=new int[5];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				a[k]=i;
				k++;
			}
		}
		return a;
	}
	int [][] a1(int arr[][])
	{
		return arr;
	}
	int q3(int i)
	{
		int cube=i*i*i;
		return cube;
	}
	double q4(double r)
	{
		double circle=(3.142*r*r);
		return circle;
	}
	String q5()
	{
		return "Bangalore";
	}
}
public class AoneTofive 
{
	public static void main(String[] args) 
	{
		Fivequestions f=new Fivequestions();
		int res[]=f.even();
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);	
		}
	System.out.println();
	
			int a[][]= {{2,4},{3,5}};
			int re[][]=f.a1(a);
			for(int m=0;m<re.length;m++)
			{
				for(int j=0;j<re[m].length;j++)
				{
					System.out.print(re[m][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			int cub=f.q3(5);
			System.out.println(cub);
			System.out.println();
			
			int cir=(int) f.q4(5);
			System.out.println(cir);
			System.out.println();
			
			String st=f.q5();
			System.out.println(st);
	}
}
