package day1_Practice;

import java.util.Scanner;

/*Takes the user's name and prints a greeting Asks for two numbers
Prints the sum, difference, product, and quotient */
public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name: ");
		String name=sc.nextLine();
		
		System.out.println(name+" enter first no: ");
		int a=sc.nextInt();
		
		System.out.println(name+" enter second no: ");
		int b=sc.nextInt();
		
		System.out.println("Sum: "+(a+b));
		System.out.println("Difference: "+(a-b));
		System.out.println("multiple: "+(a*b));
		
		if(b !=0) {
			System.out.printf("Division: "+(a/b));
		}else {
			System.out.println("Can't divided by zero");
		}
		sc.close();
	}
}
