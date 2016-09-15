package decorator;

public class Decorator extends SchoolReport{
	
	protected  SchoolReport sr ; 
	
	public Decorator(SchoolReport sr){
		this.sr = sr ; 
	}
	
	public void report(){
		this.sr.report() ; 
	}
	
	public void sign(String name){
		this.sr.sign(name) ; 
	}
}















