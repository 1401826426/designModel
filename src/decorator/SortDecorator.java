package decorator;

public class SortDecorator extends Decorator{

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}
	
	@Override
	public void report(){
		super.sr.report(); 
		this.sortReport() ; 
	}

	private void sortReport() {
		System.out.println("这次排名我是第38名");
		
	}

}
