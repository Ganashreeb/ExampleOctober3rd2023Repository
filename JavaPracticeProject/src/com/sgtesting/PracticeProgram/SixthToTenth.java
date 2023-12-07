package com.sgtesting.PracticeProgram;
class RemainingQuestion
{
	static int letter(int i)
	{
		int ch=(char) i;
		return ch;
	}
	static char num(int i)
	{
		char ch=(char) i;
		return ch;
	}
}
public class SixthToTenth 
{
	public static void main(String[] args) 
	{
		RemainingQuestion rq=new RemainingQuestion();
		int res=rq.letter('Z');
		System.out.println(res);
		char re=rq.num(90);
		System.out.println(re);
	}
}
