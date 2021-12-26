package model;

public class Candidate {
	private Long aadharId;
	private String candidateName;
	private Integer age;

	public Candidate(Long aadharId, String candidateName, Integer age) {
		this.aadharId = aadharId;
		this.candidateName = candidateName;
		this.age = age;
	}

	public Long getAadharId() {
		return aadharId;
	}

	public void setAadharId(Long aadharId) {
		this.aadharId = aadharId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
