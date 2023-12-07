package com.sgtesting.NoArgsConstructor;
class Flowers
{
	String name,root,height;  
	Flowers()
	{
		name="Chrysanthemum";
		root="Fibrous Root";
		height="50 to 150";
		System.out.println("Flower Name:          "+name);
		System.out.println("Type of Root:         "+root);
		System.out.println("Height of Plant:      "+height);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
	}
}
class Fruits
{
	String name,title,root,vitamin;  
	Fruits()
	{
		name="Mango";
		title="king of fruits";
		root="taproot";
		vitamin="vitamin A,C,K,B";
		System.out.println("Name of fruit:        "+name);
		System.out.println("Title:                "+title);
		System.out.println("Type of Root:         "+root);
		System.out.println("Vitamin:              "+vitamin);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
	}
}
class Vegetables
{
	String name,title,typeOfPlant; 
	Vegetables()
	{
		name="Pumpkin";
		title="National Vegetable";
		typeOfPlant="Climber";
		System.out.println("Name of vegetable:     "+name);
		System.out.println("Title:                 "+title);
		System.out.println("Type of Plant:         "+typeOfPlant);
	}
}
public class FlowersConstructor 
{
	public static void main(String[] args) 
	{
		Flowers fl=new Flowers();
		Fruits fr=new Fruits();	
		Vegetables vg=new Vegetables();	
	}
}

