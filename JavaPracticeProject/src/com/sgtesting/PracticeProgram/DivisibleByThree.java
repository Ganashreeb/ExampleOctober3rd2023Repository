package com.sgtesting.PracticeProgram;
class Divide
{
	void display()
	{
		for(int i=100;i>50;i--)
		{
			if(i%3==0)
			{
				System.out.println("display numbers from 100 to 50:"+i);
			}
		}
	}
}

public class DivisibleByThree 
{
	public static void main(String[] args) 
	{
		Divide d=new Divide();
		d.display();
	}

}
