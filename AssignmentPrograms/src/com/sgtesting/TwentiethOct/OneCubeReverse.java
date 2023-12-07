package com.sgtesting.TwentiethOct;
class Cube
{
	void cube()
	{
		for(int i=10;i>=1;i--)
		{
			int cube;
			cube=i*i*i;
			System.out.println(cube);
		}
	}
}
public class OneCubeReverse 
{
	public static void main(String[] args) 
	{
		Cube c=new Cube();
		c.cube();
	}
}
