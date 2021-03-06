package bo;

import model.Student;

public class StudentBO {
	String timings;

	public void displayStudentDetails(Student students[]) {

		System.out.printf("%-5s%-15s%-15s%s\n", "ID", "Name", "Percentage", "Timing");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getPercentage() >= 60 && students[i].getPercentage() <= 100) {
				timings = "2 PM to 6 PM";
			} else if (students[i].getPercentage() >= 0 && students[i].getPercentage() < 60) {
				timings = "9 AM to 1 PM";
			} else {
//				System.out.println("Invalid Percentage");
				timings = "Invalid Percentage";
			}

			System.out.printf("%-5s%-15s%-15s%s\n", students[i].getStudentId(), students[i].getStudentName(),
					students[i].getPercentage(), timings);
		}
	}
}
