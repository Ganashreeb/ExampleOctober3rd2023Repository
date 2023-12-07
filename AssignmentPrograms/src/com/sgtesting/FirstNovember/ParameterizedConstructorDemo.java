package com.sgtesting.FirstNovember;

abstract class Tress {
	Tress(String name, int root) {
		System.out.println("Tress Name :-" + name);
		System.out.println("Tress root :-" + root);
	}
}

class Fruits extends Tress {
	String name1;
	int weight;

	Fruits(String name, int root, String name1, int weight) {
		super(name, root);
		System.out.println("Fruits name :-" + name1);
		System.out.println("Fruits weight :-" + weight);
	}
}

class Flower extends Fruits {
	String name2;
	int height;

	Flower(String name, int root, String name1, int weight, String name2, int height) {
		super(name, root, name1, weight);
		System.out.println("Flower name :-" + name2);
		System.out.println("Flower height :-" + height);

	}

}

public class ParameterizedConstructorDemo {

	public static void main(String[] args) {

		Flower fl = new Flower("brinzal tree", 10, "mango", 1, "jasmin", 5);

	}

}
