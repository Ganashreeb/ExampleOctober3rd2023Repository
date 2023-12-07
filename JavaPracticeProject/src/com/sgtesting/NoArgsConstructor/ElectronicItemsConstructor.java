package com.sgtesting.NoArgsConstructor;
class Desktop
{
	String PowerSource,storage,weight;   
	Desktop()
	{
		PowerSource="Run on mains power";
		storage="More Capacity";
		weight="Heavy";
		System.out.println("DESKTOP:");
		System.out.println();
		System.out.println("Power Source:           "+PowerSource);
		System.out.println("Storage:                "+storage);
		System.out.println("Weight:                 "+weight);
		System.out.println("***************************************");
		System.out.println();	
	}
}
class Laptop
{
	String processor;
	int RAM,SSD;
	Laptop()
	{
		RAM=8;
		processor="i5";
		SSD=256;
		System.out.println("LAPTOP:");
		System.out.println();
		System.out.println("RAM:                      "+RAM+" GB");
		System.out.println("Processor:                "+processor);
		System.out.println("SSD:                      "+SSD+" GB");
		System.out.println("***************************************");
		System.out.println();
	}
}
class MobileDevice
{
	String CPU;
	int storage,RAM; 
	MobileDevice()
	{
		CPU="OctaCore";
		storage=128;
		RAM=6;
		System.out.println("MOBILE DEVICE:");
		System.out.println();
		System.out.println("CPU:"+CPU);
		System.out.println("Storage: "+storage);
		System.out.println("RAM: "+RAM);
	}
}
public class ElectronicItemsConstructor 
{
	public static void main(String[] args) 
	{
		Desktop dt=new Desktop();
		Laptop lp=new Laptop();
		MobileDevice md=new MobileDevice();
	}
}
