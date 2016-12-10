package memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	private List<Mementor> memntors  = new ArrayList<Mementor>() ; 
	
	public Mementor  getMementor(int index){
		if(index < memntors.size()){
			return memntors.get(index) ; 
		}
		return null ; 
	}

	public void setMementor(Mementor memntor){
		memntors.add(memntor) ; 
	}
	
	
}
