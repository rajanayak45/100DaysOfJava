package day6_super_keyword;


public class Animal {
	Animal(){
		System.out.println("Animal constructor called");
	}
}

class Dog extends Animal{
	Dog(){
		super();	// calls animal constructor
		System.out.println("Dog constructor called");
	}
}
