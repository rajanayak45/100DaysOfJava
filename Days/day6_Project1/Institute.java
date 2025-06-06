package day6_Project1;

/*
"Write a Java program to demonstrate multilevel inheritance and hierarchical 
inheritance with method overriding and object creation for different roles 
in an institute (Person, Student, Employee, Faculty, Admin).
 */

class Person{
	static int eyes;
	static int ears;
	
	String name;
	double height;
	double weight;
	
	void eat() {
		System.out.println(name+" is eating veg");
	}
	void sleep() {
		System.out.println(name+ " is deep sleeping");
	}
	void walk() {
		System.out.println(name+" is walking from Ameerpet to hostel");
	}
}

class Student extends Person{
	int sno;
	String course;
	double fee;
	
	void listner() {
		System.out.println(name+" is listening "+course);
	}
	void replay() {
		System.out.println(name+" is replying "+fee+" Questions");
	}
	void write() {
		System.out.println(name+" is writing "+course+" topic");
	}
	void read() {
		System.out.println(name+" is reading "+course+" notes");
	}
}

class Employee extends Person{
	double sal;
	double exp;
	void work() {
		System.out.println(name+" salary is"+sal);
	}
}

class Faculty extends Employee{
	int fno;
	String dept;
	
	void tech() {
		
	}
	void conductExam() {
		
	}
}

class Admin extends Employee{
	int ano;
	String block;
	void checkIdCard() {
		
	}
}


public class Institute {
	public static void main(String[] args) {
		Person p;
		p = new Student();
		p= new Faculty();
		p= new Admin();
		 
		Student s1=new Student();
		s1.name="Raja";
		s1.height=5.4;
		s1.course="FJ";
		s1.sno=101;
		s1.fee=18000;
		s1.eat();
		s1.listner();
		s1.read();
		s1.sleep();
		s1.walk();
		s1.replay();
		s1.write();
		System.out.println();
		
		Employee e1=new Employee();
		e1.name="Harif";
		e1.sal=10000;
		e1.work();
		e1.walk();
		System.out.println();
		
		Faculty f1 = new Faculty();
		f1.name="H.K";
		f1.sal=45000;
		f1.eat();
		f1.dept="CORE JAVA";
		f1.fno=9942;
		
	}
}
