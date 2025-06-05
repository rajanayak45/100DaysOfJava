package day3_example;

//method Overloading
public class Example6 {
	
	//method1: add 2 number
	int add(int a, int b) {
		return a+b;
	}
	
	//method2: add 3 integer
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	//method3: add 2 double
	double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		Example6 c=new Example6();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.add(1, 2, 3));
		System.out.println(c.add(2.5, 3.5));
	}
}
