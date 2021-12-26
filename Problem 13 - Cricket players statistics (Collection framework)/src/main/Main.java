package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Player;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter no of players: ");
		Integer noOfPlayers = scan.nextInt();
		scan.nextLine();

		List<Player> players = new ArrayList<Player>();
		System.out.println("Enter " + noOfPlayers
				+ " player details jersey Number, Player Name, Country, Skill, Player Innings Highest Runs, Player Innings Highest Wickets Taken , Age, Rank");

		for (int i = 0; i < noOfPlayers; i++) {
			String p[] = scan.nextLine().split(",");

			Player player = new Player(Integer.parseInt(p[0]), p[1], p[2], p[3], Integer.parseInt(p[4]),
					Integer.parseInt(p[5]), Integer.parseInt(p[6]), Integer.parseInt(p[7]));
			players.add(player);
		}

		Integer choice;
		String ans;
		do {
			System.out.println("MENU DRIVEN");
			System.out.println("1) Display Player Details");
			System.out.println("2) Sort By Rank");
			System.out.println("3) Sort By Highest Score");
			System.out.println("4) Sort By Highest Wickets Taken");
			System.out.println("5) Sort By Age");
			System.out.println("6) Search By Name");
			System.out.println("7) Search By Country");
			System.out.println("8) Search By Skill");
			System.out.println("9) Search By Jersey Number");
			System.out.println("10) Exit");
			System.out.println("Enter your choice");
			choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 1: // Display player details
				if (players.size() > 0) {
					for (Player player : players) {
						System.out.println(player);
					}
				}else {
					System.out.println("No records found");
				}

				break;

			case 2: // Sort by rank

			default:
				break;
			}

		} while (choice != 10);

		scan.close();
	}
}
