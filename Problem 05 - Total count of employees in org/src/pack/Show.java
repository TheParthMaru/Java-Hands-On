package pack;

public class Show extends Developers {
	public void display() {
		System.out.println("No. of Project Managers: " + noOfProjectManagers);
		System.out.println("No. of Team Leaders: " + noOfTeamLeaders);
		System.out.println("No. of Developers: " + noOfDevelopers);
		int totalEmployees = noOfProjectManagers + noOfTeamLeaders + noOfDevelopers;
		System.out.println("Total count of Employees: " + totalEmployees);
	}

}
