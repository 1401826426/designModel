package singleton;

public class SingletonDCL {
	
	private static SingletonDCL singleton ; 
	
	private SingletonDCL(){}
	
	public SingletonDCL getSingleton(){
		if(singleton == null){ //��һ���ж����������,û�в���Ӱ�찲ȫ��
			synchronized (SingletonDCL.class) {
				if(singleton == null){
					singleton = new SingletonDCL() ; 
				}
			}
		}
		return singleton ; 
	}
	
	
}
