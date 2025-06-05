package day2_Practice;

public class Practice4 {
	public static void main(String[] args) {
		//outer loop for row
		for(int i =1; i<=5; i++) {
		//inner loop for printing star in each row
			for (int j=1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}