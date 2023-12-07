package com.sgtesting.PracticeProgram2;
public class StringReservedKeyWords {
	public static void main(String[] args) {
		stringLength();
		emptyString();
		getCharacterBasedOnIndex();
		lowercase();
		uppercase();
		compareString1();
		compareString2();
		existnaceOfString();
		convertToCharArray();
		splitString();
		subStringDemo();
		positionStr();
		convertToStringDataType();
	}
	
	private static void stringLength()
	{
		String s=new String("Welcome");
		int v1=s.length();
		System.out.println("# of chars :"+v1);
		System.out.println("+++++++++++++++++");
	}
	
	private static void emptyString()
	{
		String s=new String();
		boolean v1=s.isEmpty();
		System.out.println("Is the given empty?:"+v1);
		System.out.println("+++++++++++++++++");
	}
	
	private static void getCharacterBasedOnIndex()
	{
		String s="WELCOME";
		char ch=s.charAt(5);
		System.out.println("character :"+ch);
		System.out.println("+++++++++++++++++");
	}
	
	private static void lowercase()
	{
		String s=new String("WELCOME");
		String res=s.toLowerCase();
		System.out.println("Lower case value:"+res);
		System.out.println("+++++++++++++++++");
	}

	private static void uppercase()
	{
		String s=new String("programming");
		String v1=s.toUpperCase();
		System.out.println("Upper case value :"+v1);
		System.out.println("+++++++++++++++++");
	}
	
	private static void compareString1()
	{
		String s1=new String("welcome");
		String s2=new String("WELCOME");
		boolean v1=s1.equals(s2);
		System.out.println("s1 and s2 are equal ?:"+v1);
		boolean v2=s1.equalsIgnoreCase(s2);
		System.out.println("s1 and s2 are equal by ignoring case ?:"+v2);
		System.out.println("+++++++++++++++++");
	}
	
	private static void compareString2()
	{
		String s1=new String("welcome");
		String s2=new String("WELCOME");
		int v1=s1.compareTo(s2);
		System.out.println("s1 and s2 are equal ?:"+v1);
		int v2=s1.compareToIgnoreCase(s2);
		System.out.println("s1 and s2 are equal by ignoring case ?:"+v2);
		System.out.println("+++++++++++++++++");
	}
	
	private static void existnaceOfString()
	{
		String s1=new String("It is a big tree at the top of the hill");
		boolean v1=s1.startsWith("It");
		System.out.println("Starts With 'It' :"+v1);
		boolean v2=s1.endsWith("hill");
		System.out.println("Ends With 'hill' :"+v2);
		boolean v3=s1.contains("tree");
		System.out.println("contains 'tree' :"+v3);
		System.out.println("+++++++++++++++++");
	}
	
	private static void convertToCharArray()
	{
		String s=new String("Welcome");
		char ch[]=s.toCharArray();
		for(char ch1 :ch)
		{
			System.out.println(ch1);
		}
		System.out.println("+++++++++++++++++");
	}
	
	private static void splitString()
	{
		String s="Apple,Mango,Ornage,Banana";
		String str[]=s.split(",");
		for(String kk:str)
		{
			System.out.println(kk);
		}
		System.out.println("+++++++++++++++++");
	}
	
	private static void subStringDemo()
	{
		String s="Programming";
		String s1=s.substring(3);
		System.out.println(s1);
		String s2=s.substring(3, 7);
		System.out.println(s2);
		System.out.println("+++++++++++++++++");
	}
	
	private static void positionStr()
	{
		String s="xxaxxaxxaXXAXXA";
		int pos1=s.indexOf('A', 0);
		System.out.println(pos1);
		int pos2=s.lastIndexOf('A');
		System.out.println(pos2);
		System.out.println("+++++++++++++++++");
	}
	
	private static void convertToStringDataType()
	{
		int a=125;
		String s=String.valueOf(a);
		System.out.println(s);
		double d=10.75;
		String s1=String.valueOf(d);
		System.out.println(s1);
		System.out.println("+++++++++++++++++");
	}
}