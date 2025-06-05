package day2_Practice;

public class Practice5 {
	public static void main(String[] args) {
		int row = 5;
		
		for (int i=1; i <=row; i++) {
			//print space
		for(int j = 1; j <=row - i; j++) {
			System.out.print("  ");
		}
		//print stars
		for(int k=1; k <=i; k++) {
			System.out.print("* ");
		}
		
		System.out.println();
		}
	}
}