package com.sgtesting.PracticeProgram;
class Primea
{
	void primea(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
			flag++;
			break;
			}
		}
			if(flag==0)
			{
				System.out.println("prime number"+num);
			}
			else
			{
				System.out.println("not prime number"+num);
			}
		}
}
public class Prime 
{
	public static void main(String[] args) 
	{
	Primea p=new Primea();
	p.primea(7);
	p.primea(10);
	}
}
