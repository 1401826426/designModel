package observer;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements Observable , IHanFeiZi{
	
	private List<Observer> observers = new ArrayList<Observer>() ; 
	
	@Override
	public void havaBreakfast() {
		System.out.println("���������ڳԷ�");
		this.notifyObservers("���������ڳԷ�");
	}

	@Override
	public void haveFun() {
		System.out.println("��������������");
		this.notifyObservers("��������������");
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer) ; 
	}

	@Override
	public void deleteObserver(Observer observer) {
		if(observers.contains(observer)){
			observers.remove(observer) ; 
 		}
	}

	@Override
	public void notifyObservers(String context) {
		for(Observer observer:observers){
			observer.update(context) ; 
		}
	}

}






















