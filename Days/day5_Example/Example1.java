package day5_Example;

//Class with methods and object creation
public class Example1 {
	//instance variables(fields)
	String name;
	int age;
	
	//method to set data
	void setData(String personName, int personAge) {
		name = personName;
		age = personAge;
	}
	
	//method to display data
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) {
		//creating an object of Person class
		Example1 e1 = new Example1();
		
		//calling method on the object
		e1.setData("Raja", 20);
		e1.display();
	}
}
