package memento;

public class Boy {
	
	private String state = "" ; 
	
	public void changeState(){
		this.state = "������ܲ���" ; 
	}
	
	public String getState(){
		return this.state ; 
	}
	
	public Memento createMemento(){
		return new Memento(this.state) ; 
	}
	
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
	}
	
	public void setState(String state){
		this.state = state ; 
	}
}

















