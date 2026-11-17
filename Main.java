 
package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Student.Student;

public class Main {

    // Store all students
    static ArrayList<Student> students = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choiceType;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choiceType = input.nextInt();
            input.nextLine();

            switch (choiceType) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    showAllStudents();
                    break;

                case 0:
                    System.out.println("Program closed. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choiceType != 0);

        input.close();
    }

    // Add Student
    public static void addStudent() {

        System.out.print("Enter national ID: ");
        String id = input.nextLine();

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter grade: ");
        double grade = input.nextDouble();
        input.nextLine();

        if (age <= 0 || grade < 0 || grade > 100) {
            System.out.println("Invalid age or grade.");
            return;
        }

        Student student = new Student(id, name, age, grade);

        students.add(student);

        System.out.println("Student added successfully.");
    }

    // Show All Students
    public static void showAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayInfo();
            System.out.println("--------------------");
        }
    }
}

