package bo;

import java.util.Comparator;

import model.Player;

public class SortByHighestRuns implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.getInHighestRun() < o2.getInHighestRun()) {
			return 1;
		} else if (o1.getInHighestRun() == o2.getInHighestRun()) {
			return 0;
		} else {
			return -1;
		}
	}

}
