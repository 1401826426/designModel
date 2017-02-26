package prototype1;

public class Mail implements Cloneable{
	private String receiver ; 
	private String subject ; 
	private String context ;
	private String tail ; 
	public Mail(AdvTemplate advtemplate){
		this.subject = advtemplate.getAdvSubject() ; 
		this.context = advtemplate.getAdvContext() ; 
	}
	
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}	
	@Override
	public Mail clone(){
		try {
			return (Mail)super.clone() ;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		return  null ; 
	}
	
}
