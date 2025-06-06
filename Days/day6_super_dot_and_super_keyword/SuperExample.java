package day6_super_dot_and_super_keyword;

/*
Example of super() -> call the superclass constructor.
		   super.  -> Accesses superclass method or variables.
*/
//superclass
class Person{
	String name;
	
	Person(String name){
		this.name=name;
		System.out.println("Person Constructor called");
	}
}

//subclass
class Student extends Person{
	int studentId;
	
	Student(String name, int studentId){
		super(name); //calls Person(name) constructor
		this.studentId=studentId;
		System.out.println("Student Constructor called");
	}
}

public class SuperExample {
	public static void main(String[] args) {
		Student s=new Student("Raja", 101);
	}
}

/*
->new Student("Raja",101); called.
->This calls the student Constructor.
->Inside the Student constructor, super(name); calls the Person constructor.
->Person constructor executes first: prints "Person Constructor Called"
->Then, the rest of the Student constructor runs and print "Student Constructor Called"

*/
