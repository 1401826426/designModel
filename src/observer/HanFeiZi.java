package observer;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements Observable , IHanFeiZi{
	
	private List<Observer> observers = new ArrayList<Observer>() ; 
	
	@Override
	public void havaBreakfast() {
		System.out.println("韩非子正在吃饭");
		this.notifyObservers("韩非子正在吃饭");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子正在娱乐");
		this.notifyObservers("韩非子正在娱乐");
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






















