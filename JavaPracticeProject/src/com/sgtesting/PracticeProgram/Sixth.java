package com.sgtesting.PracticeProgram;
class PriceNoteBook
{
	int price()
	{
		return 300;
	}
}
public class Sixth 
{
	public static void main(String[] args) 
	{
		PriceNoteBook pb=new PriceNoteBook();
		
		System.out.println("Price of the book is: "+pb.price());
	}

}
