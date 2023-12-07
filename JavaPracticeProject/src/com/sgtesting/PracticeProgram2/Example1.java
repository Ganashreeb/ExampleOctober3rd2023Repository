package com.sgtesting.PracticeProgram2;
//abstract class Figure
//{
//	abstract void calculatearea();
//}
//class Square extends Figure
//{
//	void calculatearea()
//	{
//		int side=5;
//		System.out.println("Area of a square: "+(side*side));
//	}
//}
//class Rectangle extends Figure
//{
//	void calculatearea()
//	{
//		try 
//		{
//			int l=10,b=20;
//			System.out.println("Area of a rectangle: "+(l*b));
//		}
//		catch (NumberFormatException e) 
//		{
//			e.printStackTrace();
//		}
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//		}
//	}
//}
//class Circle extends Figure
//{
//	void calculatearea()
//	{
//		double pi=3.142;
//		int r=3;
//		double res= (pi*r*r);
//		System.out.println("Area of a circle: "+res);
//	}
//}
//public class Example1 
//{
//	public static void main(String[] args) 
//	{
//		Figure f=null;
//		
//		Square s=new Square();
//		Rectangle r=new Rectangle();
//		Circle c=new Circle();
//		
//		f=s;
//		s.calculatearea();
//		f=r;		
//		f.calculatearea();
//		f=c;
//		c.calculatearea();
//	}
//}


class sample
{
	static int getCharacterCount(String str)throws Exception
	{
		if(str==null)
		{
			throw new Exception("the i/p is null,please provide valid string i/p");	
		}
		return str.length();
	}
}
public class Example1 
{
	public static void main(String[] args) 
	{
		try 
		{
		int v1=sample.getCharacterCount("react");
		System.out.println("no of char: "+v1);
		int v2=sample.getCharacterCount(null);
		System.out.println(v2);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}