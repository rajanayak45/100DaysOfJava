package day3_Practice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice3 {

    // Methods for operations
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("❌ Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice3 calc = new Practice3();
        ArrayList<String> history = new ArrayList<>();
        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("\n======= Calculator Menu =======");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. View History");
            System.out.println("6. Exit");
            System.out.print("Choose an operation (1-6): ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a number between 1 and 6.");
                sc.next(); // clear input buffer
                continue;
            }

            if (choice == 6) {
                System.out.println("✅ Exiting calculator. Goodbye!");
                break;
            } else if (choice == 5) {
                if (history.isEmpty()) {
                    System.out.println("📄 No calculations yet.");
                } else {
                    System.out.println("📜 Calculation History:");
                    for (String record : history) {
                        System.out.println(record);
                    }
                }
                continue;
            }

            // Get user numbers with validation
            double num1 = 0, num2 = 0;
            try {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("❌ Please enter valid numbers.");
                sc.next(); // clear input buffer
                continue;
            }

            double result = 0;
            boolean validOperation = true;
            String expression = "";

            switch (choice) {
                case 1:
                    result = calc.add(num1, num2);
                    expression = num1 + " + " + num2 + " = " + result;
                    break;
                case 2:
                    result = calc.subtract(num1, num2);
                    expression = num1 + " - " + num2 + " = " + result;
                    break;
                case 3:
                    result = calc.multiply(num1, num2);
                    expression = num1 + " * " + num2 + " = " + result;
                    break;
                case 4:
                    result = calc.divide(num1, num2);
                    if (Double.isNaN(result)) {
                        validOperation = false;
                    } else {
                        expression = num1 + " / " + num2 + " = " + result;
                    }
                    break;
                default:
                    System.out.println("❌ Invalid operation. Try again.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("✅ Result: " + result);
                history.add(expression);
            }
        }

        sc.close();
    }
}
