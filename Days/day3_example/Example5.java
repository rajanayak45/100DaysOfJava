package day3_example;

//setter getter method
public class Example5 {
	int sno;
	String sname;
	
	void setSno(int sno) {
		this.sno=sno;
	}
	int getSno() {
		return this.sno;
	}
	
	void setSname(String sname) {
		this.sname=sname;
	}
	String getSname() {
		return this.sname;
	}
	
	void display() {
		System.out.println(sno+" "+sname);
	}
	
	public static void main(String[] args) {
		Example5 e1=new Example5();
		e1.setSno(101);
		e1.setSname("HK");
		
		System.out.println(e1.getSno());
		System.out.println(e1.getSname());
	}
}
