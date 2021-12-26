package dao;

import model.Student;

public class Ug extends Student implements CalculatePassFail {
	public Ug(int studentId, String studentName, double percentage) {
		super(studentId, studentName, percentage);

	}

	public void classTimings() {
		System.out.println("\nUG class timings for next semester is 9 AM to 1 PM.");
	}

	public String calculation() {
		if (this.getPercentage() >= ugPassPercentage)
			return (getStudentId() + " ~ " + getStudentName() + " ~ " + getPercentage() + " ~ " + "Pass");
		else
			return (getStudentId() + " ~ " + getStudentName() + " ~ " + getPercentage() + " ~ " + "Fail");
	}
}
