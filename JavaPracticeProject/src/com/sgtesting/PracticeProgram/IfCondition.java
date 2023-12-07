package com.sgtesting.PracticeProgram;
import java.util.Scanner;
public class IfCondition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int samt=sc.nextInt();
		float discount,a;
		if(samt<=500)
		{
			System.out.println("shopping of rs "+samt);
			discount=(samt*5)/100;
			System.out.println("Discount rate "+discount);
			a=samt-discount;
			System.out.println("Total price "+a);
		}
		else if(samt<=1500)
		{
			System.out.println("shopping of rs "+samt);
			discount=(samt*10)/100;
			System.out.println("Discount rate "+discount);
			a=samt-discount;
			System.out.println("Total price "+a);
		}
		else if(samt>1500)
		{
			System.out.println("shopping of rs "+samt);
			discount=(samt*15)/100;
			System.out.println("Discount rate "+discount);
			a=samt-discount;
			System.out.println("Total price "+a);
		}
		else
		{
			System.out.println("discount is not applicable");
		}
	}
}