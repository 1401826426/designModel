package chainOfResponsibility;

public class Women implements IWomen{

	private int type = 0 ;  
	
	private String request = "" ; 
	
	public Women(int type , String request){
		this.type = type ; 
		this.request = request ; 
		switch(type){
		case 1:
			this.request = "Ů��������ʱ" + request ; 
			break ; 
		case 2:
			this.request = "���ӵ�������" + request ;  
			break ;  
		case 3:
			 this.request = "ĸ�׵�������" + request ; 
			 break ; 
		}
	}
	
	
	@Override
	public int getType() {
		return this.type;
	}

	@Override
	public String getRequest() {
		return this.request ; 
	}

}
