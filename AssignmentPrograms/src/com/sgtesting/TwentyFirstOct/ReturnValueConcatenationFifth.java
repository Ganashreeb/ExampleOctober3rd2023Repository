package com.sgtesting.TwentyFirstOct;
class Concatination
{
	String concate(String arr[][])
	{
		String s="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				s=s+" "+arr[i][j];
			}
		}
		return s;
	}
}
public class ReturnValueConcatenationFifth 
{
	public static void main(String[] args) 
	{
		Concatination cn=new Concatination();
		String a[][]= {{"gana","avyan","punith"},{"soma","manu","thanu"},{"sona","mona","aishu"}};
		String b[][]= {{"avyan","gana","punith"},{"sona","mona","aishu"},{"soma","manu","thanu"}};
		String con=cn.concate(a);
		System.out.print(con);
		System.out.println();
		String con1=cn.concate(b);
		System.out.print(con1);
	}

}
