package bo;

import java.util.ArrayList;
import java.util.List;

import model.Player;

public class SearchByName{
	public List<Player> searchByName(String name,List<Player> list) {
		
		List<Player> p = new ArrayList<Player>();
		for(int i = 0; i <list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				p.add(list.get(i));
			}
		}
		return p;
	}
}
