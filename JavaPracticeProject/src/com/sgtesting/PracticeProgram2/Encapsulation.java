package com.sgtesting.PracticeProgram2;

class Encap
{
	private String BankName;
	private int AccountNo;
	public void BankName(String BnkName)
	{
		this.BankName=BnkName;
	}
	public String getBankName()
	{
		return BankName;
	}
	public void AccountNo(int AccNo)
	{
		this.AccountNo=AccNo;
	}
	public int getAccountNo()
	{
		return AccountNo;
	}
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Encap e=new Encap();
		e.BankName("SBI");
		String b=e.getBankName();
		System.out.println(b);
		e.AccountNo(138400786);
		int a=e.getAccountNo();
		System.out.println(a);
	}
}

/*
class Enp{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println(age);
		this.age = age;
	}
	void show() 
	{
		
	}
}
public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Enp e = new Enp();
		e.setAge(12);
		e.setName("gana");
	}
}
*/