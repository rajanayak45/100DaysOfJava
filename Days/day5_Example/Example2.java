package day5_Example;

public class Example2 {

	// Static method
	static void staticMethod() {
		System.out.println("This is a STATIC method.");
	}

	// Non-static (instance) method
	void nonStaticMethod() {
		System.out.println("This is a NON-STATIC method.");
	}

	public static void main(String[] args) {
		// Calling static method directly (no object needed)
		staticMethod();

		// Calling non-static method: requires an object
		Example2 obj = new Example2();
		obj.nonStaticMethod();
	}
}
