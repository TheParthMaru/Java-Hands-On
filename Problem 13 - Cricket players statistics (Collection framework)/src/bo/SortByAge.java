package bo;

import java.util.Comparator;

import model.Player;

public class SortByAge implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		if(o1.getAge() < o2.getAge()) {
			return 1;
		}else if(o1.getAge() == o2.getAge()) {			
			return 0;
		} else {
			return -1;
		}
	}

}
