package bo;

import model.FootballMatch;

public class FootballMatchBO {
	public void printAllMatchDetails(FootballMatch[] matchList) {
		System.out.println("\nFIFA match details");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Date", "Team 1", "Team 2", "Venue", "Status", "Winner");
		for (int i = 0; i < matchList.length; i++) {
			System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", matchList[i].getHeldDate(), matchList[i].getTeamOne(),
					matchList[i].getTeamTwo(), matchList[i].getVenue(), matchList[i].getResult().getMatchStatus(),
					matchList[i].getResult().getWinner());
		}

	}

	public void printMatchDetailsWithResultStatus(FootballMatch[] matchList, String resultMatchStatus) {
		Boolean recordFound = false;
		System.out.println("\nFIFA match details");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Date", "Team 1", "Team 2", "Venue", "Status", "Winner");
		for (int i = 0; i < matchList.length; i++) {
			if (matchList[i].getResult().getMatchStatus().equals(resultMatchStatus)) {
				recordFound = true;
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", matchList[i].getHeldDate(),
						matchList[i].getTeamOne(), matchList[i].getTeamTwo(), matchList[i].getVenue(),
						matchList[i].getResult().getMatchStatus(), matchList[i].getResult().getWinner());
			}
		}
		if (recordFound == false) {
			System.out.println("No records found");
		}

	}

	public void printMatchDetailsWithResultWinner(FootballMatch[] matchList, String resultWinner) {
		Boolean recordFound = false;
		System.out.println("\nFIFA match details");
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Date", "Team 1", "Team 2", "Venue", "Status", "Winner");
		for (int i = 0; i < matchList.length; i++) {
			if (matchList[i].getResult().getWinner().equals(resultWinner)) {
				recordFound = true;
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", matchList[i].getHeldDate(),
						matchList[i].getTeamOne(), matchList[i].getTeamTwo(), matchList[i].getVenue(),
						matchList[i].getResult().getMatchStatus(), matchList[i].getResult().getWinner());

			}
		}
		if (recordFound == false) {
			System.out.println("No records found");
		}

	}
}
