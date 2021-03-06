package pack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Pancard: ");
		String pancard = scan.nextLine();

		if (pancard.matches("[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}")) {
			System.out.println("Valid Pancard");
		} else {
			System.out.println("Invalid Pancard");
		}

		System.out.println("Enter Email: ");
		String email = scan.nextLine();

		if (email.matches("[a-zA-Z.]{8,30}[@]{1}[a-zA-Z]{4,10}[.]{1}[a-zA-Z]{2,3}")) {
			System.out.println("Valid Email ID");
		} else {
			System.out.println("Invalid Email ID");
		}

		System.out.println("Enter Password: ");
		String password = scan.nextLine();

		if (password.matches("(?=.*[a-z]){2,}(?=.*[A-Z]){2,}(?=.*[3-7]){2,}(?=.*[!@#&*]){2,}.{8,16}")) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}

		scan.close();

	}

}
