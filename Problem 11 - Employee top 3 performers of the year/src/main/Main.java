package main;

import java.util.Scanner;

import bo.EmployeeBO;
import exception.DuplicateException;
import model.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Employee employee[] = new Employee[3];

		for (int i = 0; i < employee.length; i++) {
			System.out.println("Employee Id: ");
			Integer id = scan.nextInt();
			scan.nextLine();

			System.out.println("Employee name: ");
			String name = scan.nextLine();

			employee[i] = new Employee(id, name);
		}

		EmployeeBO bo = new EmployeeBO();
		try {
			bo.topThree(employee);
		} catch (DuplicateException e) {
			System.err.println(e);
		} finally {
			scan.close();
		}
	}

}
