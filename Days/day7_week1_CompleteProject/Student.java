// File: Student.java
package day7_week1_CompleteProject;

public class Student extends Person {
    protected int roll;
    protected double[] marks = new double[3]; // 3 subjects

    public Student(String name, int age, String gender, int roll, double[] marks) {
        super(name, age, gender);
        this.roll = roll;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }

    public void displayStudentInfo() {
        super.displayInfo();
        System.out.println("Roll No: " + roll);
        System.out.print("Marks: ");
        for (double m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("\nAverage: " + calculateAverage());
    }
}