package singleton;

public class SingletonDCL {
	
	private static SingletonDCL singleton ; 
	
	private SingletonDCL(){}
	
	public SingletonDCL getSingleton(){
		if(singleton == null){ //第一个判断是提高性能,没有不会影响安全性
			synchronized (SingletonDCL.class) {
				if(singleton == null){
					singleton = new SingletonDCL() ; 
				}
			}
		}
		return singleton ; 
	}
	
	
}
