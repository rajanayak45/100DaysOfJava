package day4_practice;

import java.util.Scanner;

//A 2D array program to input 2x2 elements and print the sum of all values.
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] matrix = new int[2][2];
		int sum = 0;
		
		//input 2x2 matrix elements
		System.out.println("Enter 4 elements for a 2x2 matrix: ");
		for(int i=0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.println("Element ["+i+"]["+j+"]: ");
				matrix[i][j] = sc.nextInt();
				sum +=matrix[i][j];
			}
		}
		//output the sum
		System.out.println("Sum of all elements="+sum);
		
		
		sc.close();
	}
}