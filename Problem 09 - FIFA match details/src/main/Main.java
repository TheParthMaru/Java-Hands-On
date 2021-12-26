package main;

import java.util.Scanner;

import bo.FootballMatchBO;
import model.FootballMatch;
import model.Result;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of matches: ");
		int noOfMatches = scan.nextInt();
		scan.nextLine();

		FootballMatch[] footballMatch = new FootballMatch[noOfMatches];
		Result result;

		for (int i = 0; i < footballMatch.length; i++) {
			System.out.println("\nEnter match " + (i + 1) + " details: ");

			System.out.println("Enter match date: ");
			String heldDate = scan.nextLine();

			System.out.println("Enter team one: ");
			String teamOne = scan.nextLine();

			System.out.println("Enter team two: ");
			String teamTwo = scan.nextLine();

			System.out.println("Enter venue: ");
			String venue = scan.nextLine();

			System.out.println("Enter status: ");
			String matchStatus = scan.nextLine();

			System.out.println("Enter winner team: ");
			String winner = scan.nextLine();

			result = new Result(matchStatus, winner);
			footballMatch[i] = new FootballMatch(heldDate, teamOne, teamTwo, venue, result);
		}

		int choice;
		do {
			System.out.println("\nMenu");
			System.out.println("1. View match details");
			System.out.println("2. Filter match details with result status");
			System.out.println("3. Filter match details with result winner team");
			System.out.println("4. Exit");

			System.out.println("\nEnter your choice: ");
			choice = scan.nextInt();
			scan.nextLine();

			FootballMatchBO match = new FootballMatchBO();
			switch (choice) {
			case 1:
				match.printAllMatchDetails(footballMatch);
				break;

			case 2:
				System.out.println("Enter result status: ");
				String resultStatus = scan.nextLine();

				match.printMatchDetailsWithResultStatus(footballMatch, resultStatus);
				break;

			case 3:
				System.out.println("Enter result winner team: ");
				String resultWinner = scan.nextLine();
				match.printMatchDetailsWithResultWinner(footballMatch, resultWinner);
				break;

			case 4:
				return;

			default:
				System.out.println("Invalid Choice");
			}
		} while (choice != 4);

		scan.close();
	}
}
