package com.sgtesting.SeventeenthOct;
class College
{
	College(String cname,String sname)
	{
		System.out.println("College name: "+cname);
		System.out.println("Student name: "+sname);
	}
	College(int sid)
	{
		System.out.println("Student id: "+sid);
	}
	College(String branch)
	{
		System.out.println("Branch: "+branch);
	}
}
public class CollegeConstructorDemo 
{ 
	public static void main(String[] args) 
	{
		College c=new College("KLE's college");
		College c1=new College("Shiva");
		College c2=new College(202);
		College c3=new College("Computer science");
	}
}
