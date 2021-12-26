package main;

import java.util.Scanner;

import bo.StudentBO;
import model.Student;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Student Online Class Timings Allocation System");
		System.out.println("Enter number of students: ");
		int noOfStudents = scan.nextInt();

		Student students[] = new Student[noOfStudents];

		for (int i = 0; i < noOfStudents; i++) {
			System.out.println("Enter details of student number " + (i + 1));
			System.out.println("Enter ID: ");
			int id = scan.nextInt();
			scan.nextLine();

			System.out.println("Enter name: ");
			String name = scan.nextLine();

			System.out.println("Enter percentage: ");
			float percentage = scan.nextFloat();

			students[i] = new Student();
			students[i].setStudentId(id);
			students[i].setStudentName(name);
			students[i].setPercentage(percentage);

		}

		StudentBO student = new StudentBO();
		student.displayStudentDetails(students);

		scan.close();

	}

}
