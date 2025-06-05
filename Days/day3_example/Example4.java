package day3_example;

//calling static variable and non-static variable from static method and non-static method
public class Example4 {
	static int staticVar=100;
	int nonStaticVar=200;
	
	//static method
	static void staticMethod() {
		System.out.println("Static variable: "+staticVar); //allowed
		//System.out.println("non-Static variable: "+nonStaticVar); //not-allowed
		
		//accessing non-static variable using object
		Example4 obj=new Example4();
		System.out.println(obj.nonStaticVar);
	}
	
	//non-static method
	void nonStaticMethod() {
		System.out.println("static variable:"+staticVar);
		System.out.println("non-static variable: "+nonStaticVar);
	}
	public static void main(String[] args) {
		Example4.staticMethod();
		
		Example4 obj=new Example4();
		obj.nonStaticMethod();
	}
}
