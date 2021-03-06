package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import bo.SearchByCountry;
import bo.SearchByJerseyNumber;
import bo.SearchByName;
import bo.SearchBySkill;
import bo.SortByAge;
import bo.SortByHighestRuns;
import bo.SortByHighestWicketsTaken;
import bo.SortByRank;
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
		String ans = "";
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
					System.out.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s\n", "Jersey No.", "Name", "Country",
							"Skill", "Highest Runs", "Highest Wickets Taken", "Age", "Rank");
					for (Player player : players) {
						System.out.println(player);
					}
				} else {
					System.out.println("No records found");
				}

				break;

			case 2: // Sort by rank
				Collections.sort(players, new SortByRank());
				System.out.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s\n", "Jersey No.", "Name", "Country", "Skill",
						"Highest Runs", "Highest Wickets Taken", "Age", "Rank");
				for (Player player : players) {
					System.out.println(player);
				}
				break;

			case 3: // Sort by Highest Score
				Collections.sort(players, new SortByHighestRuns());
				System.out.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s\n", "Jersey No.", "Name", "Country", "Skill",
						"Highest Runs", "Highest Wickets Taken", "Age", "Rank");
				for (Player player : players) {
					System.out.println(player);
				}
				break;

			case 4: // Sort By Highest Wickets Taken
				Collections.sort(players, new SortByHighestWicketsTaken());
				System.out.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s\n", "Jersey No.", "Name", "Country", "Skill",
						"Highest Runs", "Highest Wickets Taken", "Age", "Rank");
				for (Player player : players) {
					System.out.println(player);
				}
				break;

			case 5: // Sort By Age
				Collections.sort(players, new SortByAge());
				System.out.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s\n", "Jersey No.", "Name", "Country", "Skill",
						"Highest Runs", "Highest Wickets Taken", "Age", "Rank");
				for (Player player : players) {
					System.out.println(player);
				}
				break;

			case 6: // Search By Name
				System.out.println("Enter name: ");
				String name = scan.nextLine();

				List<Player> l1 = new SearchByName().searchByName(name, players);

				if (l1.size() > 0) {
					System.out.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s\n", "Jersey No.", "Name", "Country",
							"Skill", "Highest Runs", "Highest Wickets Taken", "Age", "Rank");
					for (Player player : l1) {
						System.out.println(player);
					}
				} else {
					System.out.println("Player Name Not Found");
				}
				break;

			case 7: // Search By Country
				System.out.println("Enter country: ");
				String country = scan.nextLine();

				List<Player> l2 = new SearchByCountry().searchByCountry(country, players);

				if (l2.size() > 0) {
					System.out.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s\n", "Jersey No.", "Name", "Country",
							"Skill", "Highest Runs", "Highest Wickets Taken", "Age", "Rank");
					for (Player player : l2) {
						System.out.println(player);
					}
				} else {
					System.out.println("Country Not Found");
				}

				break;

			case 8: // Search By Skill
				System.out.println("Enter skill: ");
				String skill = scan.nextLine();

				List<Player> l3 = new SearchBySkill().searchBySkill(skill, players);

				if (l3.size() > 0) {
					System.out.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s\n", "Jersey No.", "Name", "Country",
							"Skill", "Highest Runs", "Highest Wickets Taken", "Age", "Rank");
					for (Player player : l3) {
						System.out.println(player);
					}
				} else {
					System.out.println("Skill Not Found");
				}
				break;

			case 9: // Search By Jersey Number
				System.out.println("Enter jersey number: ");
				int jerseyNumber = scan.nextInt();
				scan.nextLine();

				List<Player> l4 = new SearchByJerseyNumber().searchByJerseyNumber(jerseyNumber, players);

				if (l4.size() > 0) {
					System.out.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s\n", "Jersey No.", "Name", "Country",
							"Skill", "Highest Runs", "Highest Wickets Taken", "Age", "Rank");
					for (Player player : l4) {
						System.out.println(player);
					}
				} else {
					System.out.println("Jersey Number Not Found");
				}

				break;

			case 10: // Exit
				System.out.println("Thank You");
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.println("Do you wish to continue? (yes/no)");
			ans = scan.nextLine().toLowerCase();
		} while (ans.equals("yes") && choice != 10);

		scan.close();
	}
}
