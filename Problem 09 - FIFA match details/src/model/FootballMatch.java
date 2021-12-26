package model;

public class FootballMatch {
	private String heldDate;
	private String teamOne;
	private String teamTwo;
	private String venue;
	private Result result;

	public FootballMatch(String heldDate, String teamOne, String teamTwo, String venue, Result result) {

		this.heldDate = heldDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
		this.result = result;
	}

	public String getHeldDate() {
		return heldDate;
	}

	public void setHeldDate(String heldDate) {
		this.heldDate = heldDate;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
