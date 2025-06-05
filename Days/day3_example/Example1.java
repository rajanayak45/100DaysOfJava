package day3_example;

//example static and not static method
public class Example1 {
	static int staticVar=10;
	int nonStaticVar=20;
	
	static void staticMethod() {
		System.out.println(staticVar);
	//	System.out.println(nonStaticVar);		//Error: cannot access non-static variabl0e 
	}
	
	void nonStaticMethod() {
		System.out.println(staticVar);
		System.out.println(nonStaticVar);
	}
	
	public static void main(String[] args) {
		Example1.staticMethod(); //calling static method by using class name
		
		Example1 obj = new Example1();
		obj.nonStaticMethod();
	}
}
