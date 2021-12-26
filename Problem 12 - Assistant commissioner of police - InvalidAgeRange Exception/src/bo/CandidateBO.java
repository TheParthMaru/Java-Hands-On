package bo;

import exception.InvalidAgeRangeException;
import model.Candidate;

public class CandidateBO {
	public void candidateDetails(Candidate candidate) throws InvalidAgeRangeException {
		if (candidate.getAge() >= 21 && candidate.getAge() <= 37) {
			System.out.println("Hi " + candidate.getCandidateName() + " " + candidate.getAge() + " ,you are eligible.");

		} else {
			throw new InvalidAgeRangeException();
		}
	}
}
