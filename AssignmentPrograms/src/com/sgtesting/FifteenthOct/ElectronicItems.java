package com.sgtesting.FifteenthOct;
class Desktop
{
	String PowerSource,storage,weight;     
}
class Laptop
{
	String processor;
	int RAM,SSD;
}
class MobileDevice
{
   String CPU;
	int storage,RAM;  
}
public class ElectronicItems 
{
	public static void main(String[] args) 
	{
		Desktop dt=new Desktop();
		dt.PowerSource="Run on mains power";
		dt.storage="More Capacity";
		dt.weight="Heavy";
		System.out.println("DESKTOP:");
		System.out.println();
		System.out.println("Power Source:           "+dt.PowerSource);
		System.out.println("Storage:                "+dt.storage);
		System.out.println("Weight:                 "+dt.weight);
		System.out.println("***************************************");
		System.out.println();
		Laptop lp=new Laptop();
		lp.RAM=8;
		lp.processor="i5";
		lp.SSD=256;
		System.out.println("LAPTOP:");
		System.out.println();
		System.out.println("RAM:                      "+lp.RAM+" GB");
		System.out.println("Processor:                "+lp.processor);
		System.out.println("SSD:                      "+lp.SSD+" GB");
		System.out.println("***************************************");
		System.out.println();
		MobileDevice md=new MobileDevice();
		md.CPU="OctaCore";
		md.storage=128;
		md.RAM=6;
		System.out.println("MOBILE DEVICE:");
		System.out.println();
		System.out.println("CPU:"+md.CPU);
		System.out.println("Storage: "+md.storage);
		System.out.println("RAM: "+md.RAM);
	}
}
