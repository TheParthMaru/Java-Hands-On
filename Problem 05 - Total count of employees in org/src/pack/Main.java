package pack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of project managers: ");
		int noOfProjectManagers = scan.nextInt();

		Show employeeData = new Show();
		employeeData.countOfProjectManager(noOfProjectManagers);

		System.out.println("Enter the number of team leaders: ");
		int noOfTeamLeaders = scan.nextInt();
		employeeData.countOfTeamLeaders(noOfTeamLeaders);

		System.out.println("Enter the number of developers: ");
		int noOfDevelopers = scan.nextInt();
		employeeData.countOfDevelopers(noOfDevelopers);

		employeeData.display();
		scan.close();

	}
}
