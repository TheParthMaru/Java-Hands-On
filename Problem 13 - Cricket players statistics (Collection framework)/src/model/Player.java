package model;

public class Player {

	private Integer jerseyNumber;
	private String name;
	private String country;
	private String skill;
	private Integer inHighestRun;
	private Integer inHighestWicketsTaken;
	private Integer age;
	private Integer rank;

	public Player() {}

	public Player(Integer jerseyNumber, String name, String country, String skill, Integer inHighestRun,
			Integer inHighestWicketsTaken, Integer age, Integer rank) {
		this.jerseyNumber = jerseyNumber;
		this.name = name;
		this.country = country;
		this.skill = skill;
		this.inHighestRun = inHighestRun;
		this.inHighestWicketsTaken = inHighestWicketsTaken;
		this.age = age;
		this.rank = rank;
	}

	public Integer getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(Integer jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Integer getInHighestRun() {
		return inHighestRun;
	}

	public void setInHighestRun(Integer inHighestRun) {
		this.inHighestRun = inHighestRun;
	}

	public Integer getInHighestWicketsTaken() {
		return inHighestWicketsTaken;
	}

	public void setInHighestWicketsTaken(Integer inHighestWicketsTaken) {
		this.inHighestWicketsTaken = inHighestWicketsTaken;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return String.format("%-13s%-8s%-15s%-16s%-15s%-25s%-10s%s", jerseyNumber,name,country,skill,inHighestRun,inHighestWicketsTaken,age,rank);
	}
}
