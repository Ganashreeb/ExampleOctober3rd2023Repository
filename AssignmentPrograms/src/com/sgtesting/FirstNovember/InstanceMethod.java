package com.sgtesting.FirstNovember;

abstract class State {
	void state(String name, int code) {
		System.out.println("Name = " + name);
		System.out.println("Code = " + code);
	}
}

class District extends State 
{
	void distict(String n)
	{
		System.out.println("district = "+n);
	}
}

public class InstanceMethod 
{
	public static void main(String[] args) 
	{
		District d = new District();
		d.state("Bangalore", 20);
		d.distict("kolar");
	}

}
