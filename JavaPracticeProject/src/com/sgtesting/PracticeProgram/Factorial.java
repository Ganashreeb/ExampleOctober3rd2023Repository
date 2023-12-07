package com.sgtesting.PracticeProgram;

import java.util.Scanner;

class Fact
{
	void fact(int num)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1=sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--)  //for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		sc.close();
	}
}
public class Factorial 
{
	public static void main(String[] args) 
	{
		Fact f=new Fact();
		f.fact(5);
	}
}
