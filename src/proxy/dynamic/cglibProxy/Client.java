package proxy.dynamic.cglibProxy;

public class Client {
	
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy() ; 
		Train t = (Train) proxy.getProxy(Train.class) ; 
		t.start(); 
		System.out.println("========================�ָ���===========================");
		t.move();
		System.out.println("========================�ָ���===========================");
		t.stop();
	}
}
