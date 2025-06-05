package day5_Example;

//creating a java class with field, constructor, method
public class Example3 {
	String name;
	int roll;
	
	//Constructor
	public Example3(String name, int roll) {
		this.name=name;
		this.roll=roll;
	}
	
	//method
	void display() {
		System.out.println("Name: "+name+", Roll: "+roll );
	}
	public static void main(String[] args) {
		Example3 e1=new Example3("Raja",101);
		e1.display();
	}
}
