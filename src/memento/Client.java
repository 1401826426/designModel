package memento;

public class Client {
	
	public static void main(String[] args) {
		Boy boy = new Boy() ; 
		Caretaker caretaker = new Caretaker() ; 
		boy.changeState("��������ܺ�");
		System.out.println(boy.getState());
		caretaker.setMementor(boy.createMemento());
		boy.setState("��������ܲ�");
		System.out.println(boy.getState());
		boy.restoreMemento(caretaker.getMementor(0));
		System.out.println(boy.getState());
	}
	
	
}
