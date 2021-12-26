package bo;

import java.util.ArrayList;
import java.util.List;

import model.Player;

public class SearchByCountry {
	public List<Player> searchByCountry(String country, List<Player> list) {
		List<Player> p = new ArrayList<Player>();
		for(int i = 0; i <list.size();i++) {
			if(list.get(i).getCountry().equals(country)) {
				p.add(list.get(i));
			}
		}
		return p;
		
	}
}
