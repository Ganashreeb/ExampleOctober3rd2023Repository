package com.sgtesting.TwentiethOct;
class CharTrans
{
	void trans(char ch[][])
	{
		for(int  i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++)
			{
				System.out.print(ch[j][i]+" ");
			}
			System.out.println();
		}
	}
}

public class CharTranspose 
{
	public static void main(String[] args) 
	{	
		char ch[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		CharTrans ct=new CharTrans();
		ct.trans(ch);
	}
}


