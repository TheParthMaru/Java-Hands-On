package bo;

import java.util.ArrayList;
import java.util.List;

import model.Player;

public class SearchByJerseyNumber {
	public List<Player> searchByJerseyNumber(int jerseyNumber,List<Player> list) {
		List<Player> p = new ArrayList<Player>();
		for(int i = 0; i <list.size();i++) {
			if(list.get(i).getJerseyNumber().equals(jerseyNumber)) {
				p.add(list.get(i));
			}
		}
		return p;
		
	}
}
