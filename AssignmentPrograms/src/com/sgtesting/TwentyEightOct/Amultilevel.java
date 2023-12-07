package com.sgtesting.TwentyEightOct;
class CarCompany
{
	void vehicleType()
	{
		System.out.println("Vehicle type: car");
		System.out.println("TATA company");
	}
}
class RangeRover extends CarCompany
{
	void RangeRov()
	{
		System.out.println("RangeRover");
	}
	void torque()
	{
		System.out.println("525PS,625Nm of torque");
	}
}
class RoverDefender extends RangeRover
{
	void model()
	{
	System.out.println("new model: RangeRover Defender");
	}
	void speed()
	{
		System.out.println("191 KMPH with 20inch wheels ");
	}
}
public class Amultilevel 
{
	public static void main(String[] args) 
	{
		RoverDefender r=new RoverDefender();
		r.RangeRov();
		r.model();
		r.speed();
		r.torque();
	}

}
