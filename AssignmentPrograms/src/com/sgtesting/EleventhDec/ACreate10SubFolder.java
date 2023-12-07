package com.sgtesting.EleventhDec;
import java.io.File;
public class ACreate10SubFolder 
{
	public static void main(String[] args) 
	{
		createFolder();
		nesCreateFolder();
	}
	
	private static void createFolder()
	{
		File file=new File("F:\\Demo\\Example\\Test");
		file.mkdir();
	}

	private static void nesCreateFolder() 
	{
		File f=new File("F:\\Demo\\Example\\Test8\\Test7\\Test6\\Test5\\Test4\\Test3\\Test2\\Test1");
		f.mkdirs();
	}	
}