package day2_Example;

//if_ifelse_else
public class Example {
	public static void main(String[] args) {
		int age=65;
	
		if(age<12) {
			System.out.println("Child ticket");
		} else if(age >=12 && age <= 60) {
			System.out.println("Adult Ticket");
		} else {
			System.out.println("Senior ticket");
		}
	}
}