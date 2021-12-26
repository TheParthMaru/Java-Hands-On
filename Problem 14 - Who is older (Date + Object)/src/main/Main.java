package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import bo.PersonBO;
import model.Person;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name1 = scan.nextLine();

		System.out.println("Enter date of birth: ");
		String dob1 = scan.nextLine();

		System.out.println("Enter name: ");
		String name2 = scan.nextLine();

		System.out.println("Enter date of birth: ");
		String dob2 = scan.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = sdf.parse(dob1);
		Date d2 = sdf.parse(dob2);

		Person person1 = new Person(name1, d1);
		Person person2 = new Person(name2, d2);

		PersonBO bo = new PersonBO();
		System.out.println(bo.findOlder(person1, person2));

		scan.close();
	}
}
