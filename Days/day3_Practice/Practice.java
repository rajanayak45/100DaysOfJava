package day3_Practice;

//create a java class with 3 method:
//		void printMessage(): prints "Good morning"
//		int multiply(int a, int b): returns the product
//		double areaOfCircle(doubble radious): returns area using πr²
public class Practice {
	
	//method 1: prints "Good  morning"
	void printMessage() {
		System.out.println("Good Morning");
	}
	
	//method 2:return the product of two int
	int multiple(int a, int b) {
		return a*b;
	}
	
	//method 3:return the area of circle using πr²
	double areaOfCircle(double radious) {
		return Math.PI*radious*radious;
	}
	
	public static void main(String[] args) {
		Practice e=new Practice();
		
		//print message
		e.printMessage();
		
		//print multiple
		int product = e.multiple(5, 3);
		System.out.println("product: "+product);
		
		//print area of circle
		double area=e.areaOfCircle(4.5);
		System.out.println("Area of Circle: "+area);
	}
}
