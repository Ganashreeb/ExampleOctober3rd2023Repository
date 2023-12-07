package com.sgtesting.FifteenthOct;
class Flowers
{
	String name,root,height;   
}
class Fruits
{
	String name,title,root,vitamin;  
}
class vegetables
{
	String name,title,typeOfPlant; 
}
public class FlowersClassMembers 
{
	public static void main(String[] args) 
	{
		Flowers fl=new Flowers();
		fl.name="Chrysanthemum";
		fl.root="Fibrous Root";
		fl.height="50 to 150";
		System.out.println("Flower Name: "+fl.name);
		System.out.println("Type of Root: "+fl.root);
		System.out.println("Height of Plant: "+fl.height);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		Fruits fr=new Fruits();
		fr.name="Mango";
		fr.title="king of fruits";
		fr.root="taproot";
		fr.vitamin="vitamin A,C,K,B";
		System.out.println("Name of fruit: "+fr.name);
		System.out.println("Title: "+fr.title);
		System.out.println("Type of Root: "+fr.root);
		System.out.println("Vitamin: "+fr.vitamin);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		vegetables vg=new vegetables();
		vg.name="Pumpkin";
		vg.title="National Vegetable";
		vg.typeOfPlant="Climber";
		System.out.println("Name of vegetable: "+vg.name);
		System.out.println("Title: "+vg.title);
		System.out.println("Type of Plant: "+vg.typeOfPlant);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
	}
}
