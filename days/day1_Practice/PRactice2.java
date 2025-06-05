package day1_Practice;

import java.util.Scanner;

public class PRactice2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first no: ");
		int a =sc.nextInt();
		
		System.out.println("Enter second no: ");
		int b =sc.nextInt();
		
		System.out.println("Add: "+(a+b));
		System.out.println("substract: "+(a-b));
		System.out.println("Add: "+(a*b));
		
		if(b !=0) {
			System.out.println("division: "+(a/b));
		}else {
		System.out.println("division by zero is not allowed");
		}
	}
}
