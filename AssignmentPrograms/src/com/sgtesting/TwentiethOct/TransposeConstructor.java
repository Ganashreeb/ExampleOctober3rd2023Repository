package com.sgtesting.TwentiethOct;
class Transpose
{
	void matrixSub(int x[][],int y[][])
	{
		if(x.length==y.length && x[0].length==y[0].length)
		{
			int sub[][]=new int[x.length][x[0].length];
			
			System.out.println("Result Before Transpose: ");
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					sub[i][j]=x[i][j]-y[i][j];
					System.out.print(sub[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Result After Transpose: ");
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					System.out.print(sub[j][i]+" ");
				}
				System.out.println();
			}
		}
	}
}
public class TransposeConstructor 
{
	public static void main(String[] args) 
	{
		Transpose tr=new Transpose();
		int a[][]= {{5,6},{99,88}};
		int b[][]= {{1,2},{11,22}};
		tr.matrixSub(a, b);
	}

}
