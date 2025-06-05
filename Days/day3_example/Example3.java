package day3_example;

//passing as value
public class Example3 {
	void modifyValue(int num) {
		num = 50;	//change only affects the local copy
	}
	
	public static void main(String[] args) {
		int x = 10;
		Example3 obj=new Example3();
		obj.modifyValue(x);	//passing primitive value
		System.out.println("Value after method call: "+x);
	}
}
