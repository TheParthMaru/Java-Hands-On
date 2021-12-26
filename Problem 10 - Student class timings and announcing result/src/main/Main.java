package main;

import java.util.Scanner;

import dao.CalculatePassFail;
import dao.Pg;
import dao.Ug;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Student Id: ");
		int id = scan.nextInt();
		scan.nextLine();

		System.out.println("Enter Student Name: ");
		String name = scan.nextLine();

		System.out.println("Enter Percentage: ");
		double percentage = scan.nextDouble();
		scan.nextLine();

		if (percentage > 100 || percentage < 0) {
			System.out.println("\nPlease check your percentage");
			scan.close();
			return;
		}

		System.out.println("Are you UG or PG student?(Enter ug or pg only)");
		String graduate = scan.nextLine();

		if (graduate.equals("ug")) {
			CalculatePassFail result = new Ug(id, name, percentage);
			result.classTimings();
			System.out.println(result.calculation());
		} else if (graduate.equals("pg")) {
			CalculatePassFail result = new Pg(id, name, percentage);
			result.classTimings();
			System.out.println(result.calculation());
		} else {
			System.out.println("\nCheck graduate");
			scan.close();
			return;
		}

		scan.close();
	}

}
