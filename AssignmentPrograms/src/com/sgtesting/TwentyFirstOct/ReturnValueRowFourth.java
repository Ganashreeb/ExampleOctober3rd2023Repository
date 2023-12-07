package com.sgtesting.TwentyFirstOct;
class CharArr
{
	char []getarr(char ch[][])
	{
		char [] res=new char[ch.length*ch[0].length];
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			res[k]=ch[0][i];
			k++;
		}
		return res;	
	}		
}
public class ReturnValueRowFourth 
{
	public static void main(String[] args) 
	{
		CharArr ca=new CharArr();
		char b[][]= {{'a','b','c'}, {'d','e','f'}, {'g','h','i'}};
		char c[]=ca.getarr(b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}