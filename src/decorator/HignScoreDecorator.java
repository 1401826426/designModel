package decorator;

public class HignScoreDecorator extends Decorator{

	public HignScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	public void reportHignScore(){
		System.out.println("��ο��Ե�������߷�Ϊ75,��ѧ��80,��Ȼ��80");
	}
	
	public void report(){
		this.reportHignScore(); 
		super.sr.report();  
	}

}
