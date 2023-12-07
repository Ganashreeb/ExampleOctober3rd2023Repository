package com.sgtesting.NoArgsConstructor;

class Country {
	String country, primeMinister, capital;

	Country() {
		country = "INDIA";
		primeMinister = "NARENDRA MODI";
		capital = "DELHI";
		System.out.println("COUNTRY NAME:                  " + country);
		System.out.println("PRIME MINISTER OF INDIA:       " + primeMinister);
		System.out.println("CAPITAL OF INDIA:              " + capital);
		System.out.println("-------------------------------------------------------");
		System.out.println();
	}
}

class State {
	String state, capital, governor;

	State() {
		state = "KARNATAKA";
		capital = "BENGALURU";
		governor = "THAWAR CHAND GEHLOT";
		System.out.println("STATE NAME:                     " + state);
		System.out.println("CAPITAL NAME:                   " + capital);
		System.out.println("GOVERNOR OF KARNATAKA:          " + governor);
		System.out.println("-------------------------------------------------------");
		System.out.println();
	}
}

class District {
	String Hdistrist;
	int NoOfDist;

	District() {
		Hdistrist = "HASSAN & HAVERI";
		NoOfDist = 31;
		System.out.println("DISTRICT NAME STARTS WITH H:     " + Hdistrist);
		System.out.println("NUMBER OF DISTRICT:              " + NoOfDist);
		System.out.println("-------------------------------------------------------");
		System.out.println();
	}
}

class Taluk {
	String biggestTaluk;
	int NoOfTaluk;

	Taluk() {
		biggestTaluk = "KOLLEGAL";
		NoOfTaluk = 240;
		System.out.println("BIGGEST TALUK:                   " + biggestTaluk);
		System.out.println("NUMBER OF TALUK IN KARNATAKA:    " + NoOfTaluk);
		System.out.println("--------------------------------------------------------");
		System.out.println();
	}
}

public class CountryConstructor {
	public static void main(String[] args) {
		Country ct = new Country();
		State st = new State();
		District dt = new District();
		Taluk tk = new Taluk();
	}
}
