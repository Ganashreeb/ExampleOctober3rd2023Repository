package com.sgtesting.PracticeProgram2;
class Singleton
{
	static Singleton obj=null;
	private Singleton()
	{
		
	}
	void addition(int x,int y)
	{
		int res=(x+y);
			System.out.println("Addition: "+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("multiplication: "+res);
	}
	static Singleton getinstance()
	{
		if(obj==null)
		{
			obj=new Singleton();
		}
		return obj;
	}
}
	
public class SingletonDesignPattern
{
	public static void main(String args[])
	{
		Singleton s=Singleton.getinstance();
		s.addition(34, 50);
		s.multiplication(38, 50);
		Singleton s1=Singleton.getinstance();
		s1.addition(5, 30);
		s1.multiplication(23, 40);
		if(s==s1)
		{
			System.out.println("singleton acheived");
		}
		else
		{
			System.out.println("singleton not achieved");
		}
	}
}

//class Singleton
//{
//	static Singleton obj=null;
//	private Singleton()
//	{
//		
//	}
//	void addition(int x,int y)
//	{
//		int res=(x+y);
//		System.out.println("Addition: "+res);
//	}
//	void multiplication(int x,int y)
//	{
//		int res=(x*y);
//		System.out.println("Multiplication: "+res);
//	}
//	public static Singleton getinstace()
//	{
//		if(obj==null)
//		{
//			obj=new Singleton();
//		}
//		return obj;
//	}
//}	
//public class SingletonDesignPattern 
//{
//	public static void main(String[] args) 
//	{
//		Singleton s=Singleton.getinstace();
//		s.addition(24, 50);
//		s.multiplication(45, 80);
//		Singleton s1=Singleton.getinstace();
//		s1.addition(67, 80);
//		s1.multiplication(35, 60);
//		if(s==s1)
//		{
//			System.out.println("singleton achieved");
//		}
//		else
//		{
//			System.out.println("singleton not acheived");
//		}
//	}
//}
