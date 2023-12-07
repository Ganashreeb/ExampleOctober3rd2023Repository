package com.sgtesting.PracticeProgram;
class Cube
{
	int calcution(int n)
	{
		return n*n*n;
	}
	
}
public class Fourth 
{
	public static void main(String[] args) 
	{
		Cube c=new Cube();
		
		int res=c.calcution(2);	
		System.out.println(res);
	}

}
