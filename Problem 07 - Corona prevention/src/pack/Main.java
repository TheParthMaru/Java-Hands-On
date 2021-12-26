package pack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter you aadhar id: ");
		long aadhar = scan.nextLong();
		scan.nextLine();

		System.out.println("Enter you name: ");
		String name = scan.nextLine();

		System.out.println("How many countries have you visited in last 6 months?");
		int n = scan.nextInt();
		scan.nextLine();

		String countries[] = new String[n];
		if (n > 0) {
			System.out.println("Enter list of " + n + " countries: ");
			for (int i = 0; i < countries.length; i++) {
				countries[i] = scan.nextLine();
			}
		}

		Corona person = new Corona();

		if (n == 0) {
			person.getDetails(aadhar, name);
		} else {
			person.getDetails(aadhar, name, countries);
		}

		scan.close();
	}
}