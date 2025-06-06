package super_to_callSuperclass_Constructor;

//Superclass(Parent class)
class Super_to_SuperConstructor{
	String name;
	//constructor of superclass
	Super_to_SuperConstructor(String name){
		this.name=name;
		System.out.println("Person Constructor called");
	}
}

//subclass (child class)
class Student extends Super_to_SuperConstructor{
	int studentId;
	//constructor of subclass
	Student(String name, int studentId){
		super(name);
		this.studentId=studentId;
		System.out.println("Student constructor called");
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Student Id: "+studentId);
	}
}

public class InheritanceDemo{
	public static void main(String[] args) {
		Student s = new Student("Alice",101);
		s.display();
	}
}


/*
I. main() starts execution
II.	new Student("Alice", 101); creates a Student object, triggering the Student constructor.
III.The Student constructor calls super(name), which invokes the Person constructor.
IV.	The Person constructor executes:
				Assigns name = "Alice".
				Prints "Person Constructor Called".
				Returns to Student Constructor.
V.	The Student constructor continues:
			o	Assigns studentId = 101.
			o	Prints "Student Constructor Called".
			o	Constructor execution completes.
VI.	Control returns to main(), where s.display(); is called.
VII.display() method prints:
			o	"Name: Alice".
		o	"Student ID: 101"
Program execution completes.

*/