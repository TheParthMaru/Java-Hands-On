package bo;

import java.util.Comparator;

import model.Player;

public class SortByHighestWicketsTaken implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.getInHighestWicketsTaken() < o2.getInHighestWicketsTaken()) {
			return 1;
		} else if (o1.getInHighestWicketsTaken() == o2.getInHighestWicketsTaken()) {
			return 0;
		} else {
			return -1;
		}
	}

}
