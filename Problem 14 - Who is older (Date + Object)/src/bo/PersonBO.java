package bo;

import model.Person;
import java.util.Date;

public class PersonBO {
	public String findOlder(Person person1, Person person2) {

		/*
		 * if ((person1.getName().equals(person2.getName())) &&
		 * (person1.getDateOfBirth().getTime()) == (person2.getDateOfBirth().getTime()))
		 * { return "Same\nNo one is older"; }
		 * 
		 * else if ((person1.getName() != (person2.getName())) &&
		 * (person1.getDateOfBirth().getTime()) < (person2.getDateOfBirth().getTime()))
		 * {
		 * 
		 * return "Different\n" + person1.getName() + " is older"; } else if
		 * ((person1.getName() != (person2.getName())) &&
		 * (person1.getDateOfBirth().getTime()) > (person2.getDateOfBirth().getTime()))
		 * {
		 * 
		 * return "Different\n " + person2.getName() + " is older"; } else {
		 * 
		 * return "Invalid Date"; }
		 */
		Date date = new Date();
		if (person1.getDateOfBirth().getTime() > date.getTime()
				|| person2.getDateOfBirth().getTime() > date.getTime()) {
			return "Invalid date";
		}

		else if (person1.getName().equals(person2.getName())) {
			if (person1.getDateOfBirth().getTime() == person2.getDateOfBirth().getTime()) {
				return "\nSame\nNo one is older";
			} else if (person1.getDateOfBirth().getTime() < person2.getDateOfBirth().getTime()) {
				return "\nSame\n" + person1.getName() + " is older";
			} else {
				return "\nSame\n" + person2.getName() + " is older";
			}
		} else {
			if (person1.getDateOfBirth().getTime() == person2.getDateOfBirth().getTime()) {
				return "\nDifferent\nNo one is older";
			} else if (person1.getDateOfBirth().getTime() < person2.getDateOfBirth().getTime()) {
				return "\nDifferent\n" + person1.getName() + " is older";
			} else {
				return "\nDifferent\n" + person2.getName() + " is older";
			}
		}
	}
}
