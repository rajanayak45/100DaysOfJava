package day3_example;

//parameterized method and non parameterized method
public class Example2 {
	void m1() {
		System.out.println("Hello, welcome to java world");
	}
	void m2(String name) {
		System.out.println("Hello, "+name+ "welcome to java world");
	}
	
	public static void main(String[] args) {
		Example2 obj=new Example2();
		
		obj.m1();
		obj.m2("RAJA ");
	}

}
