package com.sgtesting.FirstNovember;

abstract class Person {
	static void showfirstName(String name) {
		System.out.println("firstName =" + name);
	}

	static void showage(int age) {
		System.out.println("Age =" + age);
	}

}

class Person1 extends Person {
	static void showAddress(String Address) {
		System.out.println("Address =" + Address);
	}

	static void showId(int Id) {
		System.out.println("Id =" + Id);
	}
}

public class AstaticMethodAbstract {
	public static void main(String[] args) {
		Person1.showfirstName("gana shree");
		Person1.showage(25);
		Person1.showId(100016);
		Person1.showAddress("RR nagar");

	}

}
