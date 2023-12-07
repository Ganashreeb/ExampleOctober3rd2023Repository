package com.sgtesting.FirstNovember;

abstract class Student {
	static {
		System.out.println(" Static block result ");
	}

}

class College extends Student {

}

public class StaticBlockDemo {

	public static void main(String[] args) {
		College s = new College();

	}

}
