package day2_Practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int f1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int f2 = sc.nextInt();
        
        System.out.println("Chose operation(+,-,*,/): ");
        char c=sc.next().charAt(0);
        
        double result;
        
        
        switch (c){
          case '+':
            result = (double)f1+f2;
            System.out.println(result);
            break;
          case '-':
            result = f1 - f2;
            System.out.println(result);
            break;
          case '*':
            result = f1*f2;
            System.out.println(result);
            break;
          case '/':
            if(f2 !=0){
              result = f1/f2;
              System.out.println(result);
            } else {
              System.out.println("Error: can not divided by 0");
            }
            break;
          default:
          System.out.println("invalid operation selected. ");
        }
    }
}