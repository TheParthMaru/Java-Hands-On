package main;

public class Student {
	void department(int id, String name, String dept) {
		System.out.println("--------------------------------");
		System.out.println("Student Details");
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Student's Dept: " + dept);
	}

	String percentage(float percent) {
		String remarks = "";

		if (percent > 90 && percent <= 100) {
			remarks = "Excellent";
		} else if (percent > 70 && percent <= 90) {
			remarks = "Very Good";
		} else if (percent >= 60 && percent <= 70) {
			remarks = "Good";
		} else if (percent >= 50 && percent < 60) {
			remarks = "Satisfactory";
		} else if (percent < 50) {
			remarks = "Needs Improvement";
		} else if (percent < 0 || percent > 100) {
			remarks = "Please check your percentage";
		}

		return remarks;
	}
}
