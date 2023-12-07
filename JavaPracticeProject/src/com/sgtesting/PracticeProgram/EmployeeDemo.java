package com.sgtesting.PracticeProgram;
class Employee
{
	String ename,ecompany;
	int age,salary;
}
class Department
{
	String dept;
	int dnum;
}
class Insurance
{
	String instype,person;
	int insnum;
}
public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.ename="Prasanth";
		emp.ecompany="Weavers colony association";
		emp.age=32;
		emp.salary=15000;
		System.out.println("Employee Name:"+emp.ename);
		System.out.println("Company name:"+emp.ecompany);
		System.out.println("Employee Age:"+emp.age);
		System.out.println("Employee Salary:"+emp.salary);
		Department dept=new Department();
		dept.dept="Research";
		dept.dnum=23011;
		System.out.println("Employee Department:"+dept.dept);
		System.out.println("Employee number:"+dept.dnum);
		Insurance ins=new Insurance();
		ins.instype="Motor insurance";
		ins.person="Somnath";
		ins.insnum=176;
		System.out.println("Insurance type:"+ins.instype);
		System.out.println("Insurance owner:"+ins.person);
		System.out.println("insurance number:"+ins.insnum);
	}
}
