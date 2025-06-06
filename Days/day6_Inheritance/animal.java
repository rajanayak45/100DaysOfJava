package day6_Inheritance;

//parent class
public class animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

//child class
class Dog extends animal{
	void bark() {
		System.out.println("Dog barks.");
	}
}
