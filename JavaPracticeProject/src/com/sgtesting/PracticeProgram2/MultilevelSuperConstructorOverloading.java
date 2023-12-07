package com.sgtesting.PracticeProgram2;
class College
{
	College(String collegename)
	{
		System.out.print("College Name: "+collegename);
	}
	College(int collegecode)
	{
		System.out.println("College Code: "+collegecode);
	}
}
class Student extends College
{
	Student(String collegename,String name)
	{
		super(collegename);
		System.out.println();
	} 
	Student(int collegecode,String sname)
	{
		super(collegecode);
		System.out.println("Student Name: "+sname);
	}
	/*Student(String branch, int score)
	{
		System.out.println("Branch of student: "+branch);
		System.out.println("Score of student: "+score);
	}*/
}
class Library extends Student
{
	Library(String collegename,String name,int id)
	{
		super(collegename,name);
		System.out.println("Library ID: "+id);
	}
	Library(int collegecode,String sname,String bookno)
	{
		super(collegecode,sname);
		{
			System.out.println("Library Book number: "+bookno);
		}
	}
}
public class MultilevelSuperConstructorOverloading 
{
	public static void main(String[] args) 
	{
		Library l=new Library("KLE","Hamsa",9812);
		Library a=new Library(234,"Gana","Asb12");
	}

}
