package com.sgtesting.TwentyEightOct;
class Trancation
{
	long balance=5000;
	void displayBalance()
	{
		System.out.println("Minimum balance in account: rs."+balance);
	}
}
class Credit extends Trancation 
{
	void creBalance(long x)
	{
		System.out.println("credited rs: "+(balance+x));
	}
}
class Debit extends Trancation 
{
	void debBalance(long y)
	{
		System.out.println("Debited rs: "+(balance-y));
	}
}
public class Bhierarchal 
{
	public static void main(String[] args) 
	{
		Debit t=new Debit();
		t.displayBalance();
		t.debBalance(2000);
		Credit c=new Credit();
		c.displayBalance();
		c.creBalance(10000);	
	}
}
