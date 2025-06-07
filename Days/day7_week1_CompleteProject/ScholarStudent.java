// File: ScholarStudent.java
package day7_week1_CompleteProject;

public class ScholarStudent extends Student {
    private double scholarshipAmount;

    public ScholarStudent(String name, int age, String gender, int roll, double[] marks, double scholarshipAmount) {
        super(name, age, gender, roll, marks);
        this.scholarshipAmount = scholarshipAmount;
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Scholarship Amount: ₹" + scholarshipAmount);
    }
}