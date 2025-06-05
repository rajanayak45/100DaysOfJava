package day1_Example;

public class Example {
	public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic
        System.out.println("Sum: " + (a + b));
        System.out.println("Multiplication: " + (a * b));

        // Comparison
        System.out.println("a > b: " + (a > b));

        // Logical
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));

        // Assignment
        int c = 7;
        c += 3;  // c = c + 3
        System.out.println("Updated c: " + c);

        // Unary
        int d = 4;
        d++; // d becomes 5
        System.out.println("Incremented d: " + d);
    }
}
