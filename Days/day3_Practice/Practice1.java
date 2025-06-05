package day3_Practice;

//create a class with an overloaded method print Data:
//					void printData(int)
//					void printData(String)
//					void printData(int, String)
public class Practice1 {
	//method 1: takes an int
		void printData(int num) {
			System.out.println("Integer value: "+num);
		}
	//method 2: takes a string
		void printData(String text) {
			System.out.println("String value: "+text);
		}
	//method 3: takes an int and a string
		void printData(int num, String text) {
			System.out.println("Integer: "+num+",String: "+text);
		}
		public static void main(String[] args) {
			Practice1 e1= new Practice1();
			
			//calling each overloaded method
			e1.printData(10);
			e1.printData("HELLO");
			e1.printData(25, "RAJA");
		}
}
