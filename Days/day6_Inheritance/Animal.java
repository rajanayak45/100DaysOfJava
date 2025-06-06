package day6_Inheritance;

//parent class
class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

//child class
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks.");
	}
}


