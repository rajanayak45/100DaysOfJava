package day8_method_overriding;

class Employee{
	protected String name;
	protected double salary;
	
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Base Salary: ₹"+salary);
	}
	
	public double calculateBonus() {
		return salary*0.05; //default 5% bonus
	}
}

class Manager extends Employee{
	private double allowance;

	public Manager(String name, double salary, double allowance) {
		super(name, salary);
		this.allowance =allowance;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Allowance: ₹" + allowance);
	}
	
	@Override
	public double calculateBonus() {
		return salary *0.10 + allowance;	//10% bonus + allowance
	}
}

class Developer extends Employee{
	private String techStack;
	
	public Developer(String name, double salary, String techStack) {
		super(name,salary);
		this.techStack=techStack;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Technology: "+techStack);
	}
	
	@Override
	public double calculateBonus() {
		return salary * 0.08; //8% bonus for developer
	}
}

class Tester extends Employee{
	private int bugsFound;
	
	public Tester(String name, double salary, int bugsFound) {
		super(name, salary);
		this.bugsFound = bugsFound;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Bugs Found: "+bugsFound);
	}
	
	@Override
	public double calculateBonus() {
		return (salary*0.05) + (bugsFound * 100);
	}
}


public class Company {
	public static void main(String[] args) {
		Employee e1 = new Manager("Raja",80000, 5000);
		Employee e2 = new Developer("kiran", 60000, "java");
		Employee e3 = new Tester("suman", 50000, 10);
		
		System.out.println("=====Manager Details=====");
		e1.displayDetails();
		System.out.println("Bonus: ₹"+e1.calculateBonus());
		
		System.out.println();
		
		System.out.println("=====Developer Details=====");
		e2.displayDetails();
		System.out.println("Bonus: ₹"+e2.calculateBonus());
		
		System.out.println();
		
		System.out.println("=====Tester Details=====");
		e3.displayDetails();
		System.out.println("Bonus: ₹"+e3.calculateBonus());
		
	}

}
















