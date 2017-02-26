package singleton;

public class SingletonLazy {
	
	private SingletonLazy singleton ; 
	private SingletonLazy(){}
	public synchronized SingletonLazy getSingleton(){
		if(singleton == null){
			singleton = new SingletonLazy() ; 
		}
		return singleton ; 
	}
	
	
}
