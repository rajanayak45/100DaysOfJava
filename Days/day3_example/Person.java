package day3_example;

//passing object as an argument to a method
public class Person {
	String name;
	
	//constructor
	Person(String name){
		this.name=name;
	}
	
	//method that taken an object as a parameter
	void display(Person p) {
		System.out.println("Hello, "+p.name+"!");
	}
	
	public static void main(String[] args) {
		Person obj=new Person("Raja"); //creating an object
		obj.display(obj);//passing object as argument
	}

}
