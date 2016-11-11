package proxy.staticProxy2;

public class Client {
	public static void main(String[] args) {
		Moveable m = new Car() ; 
		CarLogProxy clp = new CarLogProxy(m) ; 
		CarTimeProxy ctp = new CarTimeProxy(clp) ; 
		ctp.move();  
	}
}
