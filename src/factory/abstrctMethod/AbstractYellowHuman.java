package factory.abstrctMethod;

public abstract class AbstractYellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黄种人的肤色是黄色");
	}

	@Override
	public void talk() {
		System.out.println("黄种人说话一般熟双字节");		
	}

	
	

}
