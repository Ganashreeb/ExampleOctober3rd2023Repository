package com.sgtesting.TwentiethOct;
class Concatenate
{
	String concate(char a[][])
	{
		String str="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				str=str+a[i][j];
			}
		}
		return str;
	}
}
public class CharConcateEighth 
{
	public static void main(String[] args) 
	{
		Concatenate cn=new Concatenate();
		char a[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		String con=cn.concate(a);
		System.out.print(con);
	}

}
