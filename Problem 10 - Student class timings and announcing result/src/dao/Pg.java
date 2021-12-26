package dao;

import model.Student;

public class Pg extends Student implements CalculatePassFail {

	public Pg(int studentId, String studentName, double percentage) {
		super(studentId, studentName, percentage);

	}

	@Override
	public void classTimings() {
		System.out.println("\nPG class timings for next semester is 2 PM to 6 PM.");

	}

	@Override
	public String calculation() {
		if (this.getPercentage() >= pgPassPercentage)
			return (getStudentId() + " ~ " + getStudentName() + " ~ " + getPercentage() + " ~ " + "Pass");
		else
			return (getStudentId() + " ~ " + getStudentName() + " ~ " + getPercentage() + " ~ " + "Fail");
	}

}
