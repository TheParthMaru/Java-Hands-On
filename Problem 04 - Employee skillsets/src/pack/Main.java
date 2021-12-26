package pack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter employee id: ");
		int eid = scan.nextInt();
		scan.nextLine();

		System.out.println("Enter employee name: ");
		String ename = scan.nextLine();

		System.out.println("Enter technical skills: ");
		String skills = scan.nextLine();

		Employee e1 = new Employee();
		e1.setEmployeeId(eid);
		e1.setEmployeeName(ename);
		e1.setTechnicalSkills(skills);

		Display d = new Display();
		d.show(e1);

		scan.close();
	}

}
