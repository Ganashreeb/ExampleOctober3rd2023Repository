package com.sgtesting.FifteenthOct;
class Country
{
	String country,primeMinister,capital;
}
class State
{
	String state,capital,governor;
}
class District
{
	String Hdistrist;
	int NoOfDist;
}
class Taluk
{
	String biggestTaluk;
	int NoOfTaluk;
}
public class CountryClassMembers 
{
	public static void main(String[] args) 
	{
		Country ct=new Country();
		ct.country="INDIA";
		ct.primeMinister="NARENDRA MODI";
		ct.capital="DELHI";
		System.out.println("COUNTRY NAME:                  "+ct.country);
		System.out.println("PRIME MINISTER OF INDIA:       "+ct.primeMinister);
		System.out.println("CAPITAL OF INDIA:              "+ct.capital);
		System.out.println("-------------------------------------------------------");
		System.out.println();
		State st=new State();
		st.state="KARNATAKA";
		st.capital="BENGALURU";
		st.governor="THAWAR CHAND GEHLOT";
		System.out.println("STATE NAME:                     "+st.state);
		System.out.println("CAPITAL NAME:                   "+st.capital);
		System.out.println("GOVERNOR OF KARNATAKA:          "+st.governor);
		System.out.println("-------------------------------------------------------");
		System.out.println();
		District dt=new District();
		dt.Hdistrist="HASSAN & HAVERI";
		dt.NoOfDist=31;
		System.out.println("DISTRICT NAME STARTS WITH H:     "+dt.Hdistrist);
		System.out.println("NUMBER OF DISTRICT:              "+dt.NoOfDist);
		System.out.println("-------------------------------------------------------");
		System.out.println();
		Taluk tk=new Taluk();
		tk.biggestTaluk="KOLLEGAL";
		tk.NoOfTaluk=240;	
		System.out.println("BIGGEST TALUK:                   "+tk.biggestTaluk);
		System.out.println("NUMBER OF TALUK IN KARNATAKA:    "+tk.NoOfTaluk);
		System.out.println("--------------------------------------------------------");
		System.out.println();
	}
}
