package day4_example;

public class Example2 {
	public static void main(String[] args) {
		String str="Hello, Raja welcome to java world";
		
		System.out.println("Length: "+str.length());
		System.out.println("Char at 2: "+str.charAt(0));
		System.out.println("Uppercase: "+ str.toUpperCase());
		System.out.println("Substring (0,5): "+str.substring(0,5));
		System.out.println("Replace: "+str.replace("Raja","jagan"));
	}
}
