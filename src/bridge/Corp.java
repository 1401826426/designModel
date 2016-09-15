package bridge;

public abstract class Corp {
	
	protected abstract void produce() ; 
	
	public abstract void sell() ; 
	
	public void makeMoney(){
		this.produce() ; 
		this.sell();  
	}
}

































