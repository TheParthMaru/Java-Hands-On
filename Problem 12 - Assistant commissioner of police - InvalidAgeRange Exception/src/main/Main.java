package main;

import java.util.Scanner;

import bo.CandidateBO;
import exception.InvalidAgeRangeException;
import model.Candidate;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter candidate aadhar ID: ");
		Long aadharId = scan.nextLong();
		scan.nextLine();

		System.out.println("Enter candidate name: ");
		String name = scan.nextLine();

		System.out.println("Enter candidate age: ");
		Integer age = scan.nextInt();

		Candidate candidate = new Candidate(aadharId, name, age);

		CandidateBO bo = new CandidateBO();
		try {
			bo.candidateDetails(candidate);
		} catch (InvalidAgeRangeException e) {
			System.err.println("Custom Exception: " + e.getClass().getSimpleName() + ". " + e);
		} finally {
			scan.close();
		}

	}
}
