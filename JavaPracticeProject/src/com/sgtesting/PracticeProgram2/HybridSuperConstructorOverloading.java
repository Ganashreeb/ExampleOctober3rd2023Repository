package com.sgtesting.PracticeProgram2;
class Car
{
	Car(String name)
	{
		System.out.println("Car name: "+name);
	}
	Car(int seatcap)
	{
		System.out.println("Seating capacity of Car: "+seatcap);
	}
	Car(int hpower,String name1)
	{
		System.out.println("Horsepower: "+hpower);
		System.out.println("Engine: "+name1);
	}
}
class  Xuv extends Car
{
	Xuv(String name,String name2)
	{
		super(name);
		System.out.println("XUV(cross utility vehicle) name: "+name2);
	}
	Xuv(int seatcap,int seatcap1)
	{
		super(seatcap);
		System.out.println("seat capacity: "+seatcap1);
	}
	Xuv(int hpower,String name1,int hpower1)
	{
		super(hpower,name1);
		System.out.println("horse power "+hpower1);
		System.out.println();
	}
}
class  Tuv extends Car
{
	Tuv(String name,String name3)
	{
		super(name);
		System.out.println("TUV(cross utility vehicle) name: "+name3);
	}
	Tuv(int seatcap,int seatcap2)
	{
		super(seatcap);
		System.out.println("seat capacity of TUV: "+seatcap2);
	}
	Tuv(int hpower,String name1,String hpower2)
	{
		super(hpower,name1);
		System.out.println("horse power "+hpower2);
	}
}
class Suv extends Tuv
{
	Suv(String name,String name3,String name4)
	{
		super(name,name3);
		System.out.println("TUV(cross utility vehicle) name: "+name4);
	}
	Suv(int seatcap,int seatcap2,int seatcap3)
	{
		super(seatcap,seatcap2);
		System.out.println("seating capacity of SUV : "+seatcap3);
	}
	Suv(int hpower,String name1,String hpower2,String hpower3)
	{
		super(hpower,name1,hpower2);
		System.out.println("horse power "+hpower3);
		System.out.println();
	} 
}

public class HybridSuperConstructorOverloading 
{
	public static void main(String[] args) 
	{
		Xuv x=new Xuv("Mahindra xuv 500","Mahindra xuv 500");
		Xuv x1=new Xuv(153, "2179 cc", 7);
		Suv s=new Suv(200, 986, 67);
		Suv s1=new Suv(30, 7, 67);
	}

}
