package day6_miniPracticeTask;

public class Vehicle {
	int speed=50;
	void showSpeed() {
		System.out.println("Speed: "+speed+"km/h");
	}
}

class Car extends Vehicle{
	int speed=100;
	
	void display() {
		System.out.println("Car speed: "+speed); //child class speed
		System.out.println("Vehicle speed: "+super.speed); //parent class speed
	}
}
