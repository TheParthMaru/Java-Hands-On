package bo;

import java.util.ArrayList;
import java.util.List;

import model.Player;

public class SearchBySkill {
	public List<Player> searchBySkill(String skill,List<Player> list) {
		List<Player> p = new ArrayList<Player>();
		for(int i = 0; i <list.size();i++) {
			if(list.get(i).getSkill().equals(skill)) {
				p.add(list.get(i));
			}
		}
		
		return p;
	}
}
