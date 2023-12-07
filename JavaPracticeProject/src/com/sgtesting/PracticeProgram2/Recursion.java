package com.sgtesting.PracticeProgram2;
class Maths
{
	int getFactorial(int num)
	{
		if(num==1)
		{
			return 1;
		}
		return num*getFactorial(num-1);
	}
}
public class Recursion 
{
	public static void main(String[] args) 
	{
		Maths m=new Maths();
		int res=m.getFactorial(9);
		System.out.println(res);
	}
}


/*
class Rec {
	int count = 10;

	void recursion() {
		if (count <= 20) {
			System.out.println(count);
			count++;
			recursion();
		}
	}
}

public class Recursion {
	public static void main(String[] args) {
		Rec r = new Rec();
		r.recursion();
	}
}
*/