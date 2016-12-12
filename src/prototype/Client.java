package prototype;

public class Client {
	
	public static void main(String[] args) {
		ConcretePrototype  cp = new ConcretePrototype() ; 
		ConcretePrototype cloneCp = (ConcretePrototype) cp.clone() ; 
		cloneCp.operate();  
	}
	
}
