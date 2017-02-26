package prototype1;

public class AdvTemplate {
	private String advContext ;  
	private String advSubject ;
	public String getAdvContext() {
		return advContext;
	}
	public void setAdvContext(String advContext) {
		this.advContext = advContext;
	}
	public String getAdvSubject() {
		return advSubject;
	}
	public void setAdvSubject(String advSubject) {
		this.advSubject = advSubject;
	}
	public AdvTemplate(String advContext, String advSubject) {
		super();
		this.advContext = advContext;
		this.advSubject = advSubject;
	} 
}
