package com.sgtesting.FifteenthOct;
class Employee
{
	String name,job;
	long age,salary;
}
class Department
{
	String dName,loc;
	int deptno;
}
class Insurance
{
	String incType, policyHolder;
	int incNum;
}
public class EmployeeClassMembers 
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.name="Asha Kiran";
		emp.job="Doctor";
		emp.age=45;
		emp.salary=200000;
		System.out.println("NAME:    "+emp.name);
		System.out.println("JOB:     "+ emp.job);
		System.out.println("SALARY:  "+emp.salary);
		System.out.println("AGE:     "+emp.age);
		System.out.println("--------------------------------");
		System.out.println();
		Department dept=new Department();
		dept.dName="Research";
		dept.loc="Sriharikota";
		dept.deptno=15;
		System.out.println("DEPARTMENT NAME:    "+dept.dName);
		System.out.println("LOCATION:           "+dept.loc);
		System.out.println("DEPARTMENT NUMBER:  "+dept.deptno);
		System.out.println("--------------------------------");
		System.out.println();
		Insurance ins=new Insurance();
		ins.incType="Health";
		ins.policyHolder="Asha Kiran";
		ins.incNum=0220;
		System.out.println("INSURANCE TYPE:    "+ins.incType);
		System.out.println("POLICY HOLDER:     "+ins.policyHolder);
		System.out.println("INSURANCE NUMBER:  "+ins.incNum);
	}
}
