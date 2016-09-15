package chainOfResponsibility;

public abstract class Handler {
	
	protected final static int FATHER_LEVEL_REQUEST = 1 ; 
	protected final static int HUSBAND_LEVEL_REQUEST = 2 ; 
	protected final static int SON_LEVEL_REQUEST = 3  ; 
	
	
	private int level  = 0 ; 
	
	private Handler nextHandler  ; 
	
	public Handler(int level){
		this.level = level ; 
	}
	
	public final void handleMessage(IWomen women){
		
		if(women.getType() == level){
			this.response(women) ; 
		}else{
			if(this.nextHandler != null){
				this.nextHandler.handleMessage(women);
			}else{
				System.out.println("没地发请示了,那就不同意吧！！！！！");
			}
		}
	}

	public void setNext(Handler handler){
		this.nextHandler = handler ; 
	}
	
	protected abstract void response(IWomen women); 
	
}
























