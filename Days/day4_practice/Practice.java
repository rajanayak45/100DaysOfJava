package day4_practice;

import java.util.Scanner;

//A Java program to store 5 integers in an array and print them in reverse.
public class Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[5];
		
		//taking input from the user
		System.out.println("Enter 5 integers: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//printing in reverse order
		System.out.println("Array elements in reverse order: ");
		for(int i=arr.length-1; i>=0;i--) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}