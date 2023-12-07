package com.sgtesting.PracticeProgram;
class StrArray
{
	String [] reverse(String arr[])
	{
		String[] s=new String[arr.length];
		int k=0;
			int i=arr.length-1;
			while(i>=0)
			{
				s[k]=arr[i];
				i--;
				k++;
			}
		return s;
	}
}
public class StringArrayInReverse 
{
	public static void main(String[] args) 
	{
		String rr[]= {"print","the","statement","in","reverse","order","in","a","array"};
		StrArray sa=new StrArray();
		String s1[]=sa.reverse(rr);
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println();
		String s2[]=sa.reverse(rr);
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s1[i]);
		}
	}

}
