// File: StudentManagementApp.java
package day7_week1_CompleteProject;

import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();

                    double[] marks = new double[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                        marks[i] = sc.nextDouble();
                    }

                    System.out.print("Is this student a scholar? (yes/no): ");
                    String isScholar = sc.next();

                    if (isScholar.equalsIgnoreCase("yes")) {
                        System.out.print("Enter Scholarship Amount: ");
                        double scholarship = sc.nextDouble();
                        students[count] = new ScholarStudent(name, age, gender, roll, marks, scholarship);
                    } else {
                        students[count] = new Student(name, age, gender, roll, marks);
                    }
                    count++;
                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println("\n--- Student " + (i + 1) + " Details ---");
                        students[i].displayStudentInfo();
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}