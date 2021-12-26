package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Student Id: ");
		int id = scan.nextInt();

		scan.nextLine();

		System.out.println("Enter Student Name: ");
		String name = scan.nextLine();

		System.out.println("Enter Department: ");
		String dept = scan.nextLine();

		System.out.println("Enter percentage: ");
		float percentage = scan.nextFloat();

		Student s1 = new Student();
		s1.department(id, name, dept);

		System.out.println("Remarks: " + s1.percentage(percentage));
		scan.close();

		/*
		 * Test Cases 123, Dravid, CSE, 78.67: very good 123, Dravid, CSE, 98.67:
		 * excellent 123, Dravid, CSE, 102: please check
		 */

	}

}
