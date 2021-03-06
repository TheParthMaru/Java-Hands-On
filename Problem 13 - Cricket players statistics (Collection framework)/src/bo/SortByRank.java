package bo;

import java.util.Comparator;

import model.Player;

public class SortByRank implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.getRank() > o2.getRank()) {
			return 1;
		} else if (o1.getRank() == o2.getRank()) {
			return 0;
		} else {
			return -1;
		}
	}
}
