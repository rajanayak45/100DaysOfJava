package day6_super_dot_and_super_keyword;

/*
Example of super() -> call the superclass constructor.
		   super.  -> Accesses superclass method or variables.
*/

//Superclass
class Animal{
	String color="red";
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//subclass
class Dog extends Animal{
	String itm="vegeterian";
	void makeSound() {
		super.makeSound();   //calls animal's makeSound() method
		System.out.println("Dog barks");
		System.out.println("Items: "+itm);	//refers to subclass variable
		System.out.println("Animal color: "+super.color); //refers to superclass variables
	}
}

//main method
public class SuperMethodExample {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.makeSound();
	}
}
