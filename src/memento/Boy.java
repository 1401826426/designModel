package memento;

public class Boy {
	
	private String state = "" ; 
	
	public void changeState(String s){
		this.state = s ; 
	}
	
	public String getState(){
		return this.state ; 
	}
	
	public Mementor createMemento(){
		return new Mementor(this.state) ; 
	}
	
	public void restoreMemento(Mementor memento){
		this.setState(memento.getState());
	}
	
	public void setState(String state){
		this.state = state ; 
	}
}


















