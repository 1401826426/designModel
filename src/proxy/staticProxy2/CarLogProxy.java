package proxy.staticProxy2;

public class CarLogProxy implements Moveable{
	
	private Moveable m ; 
	
	
	public CarLogProxy(Moveable m){
		this.m = m ;
	}
	
	@Override
	public void move() {
		System.out.println("日志开始...........");
		m.move();  
		System.out.println("日志结束。。。。。。。。。。。");
	}
}
