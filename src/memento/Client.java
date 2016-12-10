package memento;

public class Client {
	
	public static void main(String[] args) {
		Boy boy = new Boy() ; 
		Caretaker caretaker = new Caretaker() ; 
		boy.changeState("今天心情很好");
		System.out.println(boy.getState());
		caretaker.setMementor(boy.createMemento());
		boy.setState("今天心情很差");
		System.out.println(boy.getState());
		boy.restoreMemento(caretaker.getMementor(0));
		System.out.println(boy.getState());
	}
	
	
}
