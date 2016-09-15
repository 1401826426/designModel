package decorator;

public class HignScoreDecorator extends Decorator{

	public HignScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	public void reportHignScore(){
		System.out.println("这次考试的语文最高分为75,数学是80,自然是80");
	}
	
	public void report(){
		this.reportHignScore(); 
		super.sr.report();  
	}

}
