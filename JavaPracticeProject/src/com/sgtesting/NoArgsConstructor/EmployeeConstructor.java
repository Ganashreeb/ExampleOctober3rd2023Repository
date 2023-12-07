package com.sgtesting.NoArgsConstructor;
class Employee
{
	String name,job;
	long age,salary;
	Employee()
	{
		name="Asha Kiran";
		job="Doctor";
		age=45;
		salary=200000;
		System.out.println("NAME:    "+name);
		System.out.println("JOB:     "+ job);
		System.out.println("SALARY:  "+salary);
		System.out.println("AGE:     "+age);
		System.out.println("--------------------------------");
		System.out.println();
	}
}
class Department
{
	String dName,loc;
	int deptno;
	Department()
	{
		dName="Research";
		loc="Sriharikota";
		deptno=15;
		System.out.println("DEPARTMENT NAME:    "+dName);
		System.out.println("LOCATION:           "+loc);
		System.out.println("DEPARTMENT NUMBER:  "+deptno);
		System.out.println("--------------------------------");
		System.out.println();
	}
}
class Insurance
{
	String incType, policyHolder;
	int incNum;
	Insurance()
	{
		incType="Health";
		policyHolder="Asha Kiran";
		incNum=0220;
		System.out.println("INSURANCE TYPE:    "+incType);
		System.out.println("POLICY HOLDER:     "+policyHolder);
		System.out.println("INSURANCE NUMBER:  "+incNum);
	}
}
public class EmployeeConstructor 
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		Department dept=new Department();
		Insurance ins=new Insurance();

	}
}
