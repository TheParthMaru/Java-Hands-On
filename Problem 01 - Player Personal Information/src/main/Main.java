package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter date of birth: ");
		String dob = scan.nextLine();
		
		System.out.println("Did you win state/national level? ");
		String level = scan.nextLine();

		System.out.println("Did you win in the game/ atheletics? ");
		String game = scan.nextLine();

		System.out.println("Enter your athletic event/game name: ");
		String event = scan.nextLine();

		System.out.println("Enter you position 1st/2nd/3rd: ");
		String position = scan.nextLine();

		System.out.println("Where it was held and date? ");
		String venueDate = scan.nextLine();

		System.out.println("Enter you weight: ");
		double weight = scan.nextDouble();

		System.out.println("Enter you mobile number: ");
		Long number = scan.nextLong();
		scan.nextLine();

		System.out.println("Enter email: ");
		String email = scan.nextLine();

//		Displaying information
		System.out.println("Name, Date of birth, Weight, Game/Athletics");
		System.out.println(name + ", " + dob + ", " + weight + ", " + game);
		System.out.println("Event, State/National Level, Position, Held and Date");
		System.out.println(event + ", " + level + ", " + position + ", " + venueDate);
		System.out.println("Mobile, Email");
		System.out.println(number + ", " + email);
		
		scan.close();
	}

}
