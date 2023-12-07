package com.sgtesting.PracticeProgram2;
abstract class College1
{
	abstract void showCollegeName(String name);
	abstract void showCollegeLocation(String loc);
	void displayCourses(String courses[])
	{
		System.out.println("courses are....");
		for(int i=0;i<courses.length;i++)
		{
			System.out.println("course name: "+courses[i]);
		}
	}
}
class EngineeringCollege extends College1
{
	void showCollegeName(String name)
	{
		System.out.println("Engineering College name: "+name);
	}
	void showCollegeLocation(String location)
	{
		System.out.println("Engineering College location: "+location);
	}
	void displayCityName(String cityname)
	{
		System.out.println(" city name: "+cityname);
	}
}
public class AbstractClass 
{
	public static void main(String[] args) 
	{
		College1 c=new EngineeringCollege();
		c.showCollegeName("MCC");
		c.showCollegeLocation("Palace road, VasanthNagar");
		String a[]= {"Computer Science", "Biology","Electronics"};
		c.displayCourses(a);
	}
}
