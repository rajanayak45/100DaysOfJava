package day5_Example;

public class Example {
	String brand;		//field
	int speed;
	
	void driver() {
		System.out.println(brand+" is driving at "+speed+" km/h");
	}
	
	public static void main(String[] args) {
		Example e=new Example();
		e.brand="Toyota";
		e.speed=100;
		
		e.driver();
	}
}
