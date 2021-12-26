package model;

public class Result {
	private String matchStatus;
	private String winner;

	public Result(String matchStatus, String winner) {
		this.matchStatus = matchStatus;
		this.winner = winner;
	}

	public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
}
