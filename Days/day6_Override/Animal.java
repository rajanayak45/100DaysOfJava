package day6_Override;

public class Animal {
	void makeSound() { //super class method
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {	//override the superclass method
		System.out.println("Dog barks");
	}
}
