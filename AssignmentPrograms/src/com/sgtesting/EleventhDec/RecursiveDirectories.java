package com.sgtesting.EleventhDec;

import java.io.File;

public class RecursiveDirectories 
{
	public static void main(String[] args) 
	{
		recursiveDirectories("F:\\ECLIPSE\\eclipse");
	}

	private static void recursiveDirectories(String folderpath) 
	{
		try 
		{
			File f1=new File(folderpath);
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isDirectory()==true)
				{
					String foldername=f2[i].getAbsolutePath();
					System.out.println(foldername);
					recursiveDirectories(foldername);
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
