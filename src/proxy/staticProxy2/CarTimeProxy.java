package proxy.staticProxy2;

public class CarTimeProxy implements Moveable{
	
	
	private Moveable m ; 
	
	public CarTimeProxy(Moveable m) {
		this.m = m ; 
	}
	
	@Override
	public void move() {
		Long start = System.currentTimeMillis() ; 
		System.out.println("汽车开始行驶.............");
		m.move();  
		System.out.println("汽车结束行驶..............");
		Long end = System.currentTimeMillis() ; 
		System.out.println("汽车行驶时间为" +  (end-start));
		
	}

}


















