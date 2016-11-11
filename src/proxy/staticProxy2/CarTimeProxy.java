package proxy.staticProxy2;

public class CarTimeProxy implements Moveable{
	
	
	private Moveable m ; 
	
	public CarTimeProxy(Moveable m) {
		this.m = m ; 
	}
	
	@Override
	public void move() {
		Long start = System.currentTimeMillis() ; 
		System.out.println("������ʼ��ʻ.............");
		m.move();  
		System.out.println("����������ʻ..............");
		Long end = System.currentTimeMillis() ; 
		System.out.println("������ʻʱ��Ϊ" +  (end-start));
		
	}

}


















