package factory.abstrctMethod;

public abstract class AbstractBlackHuman implements Human{
	
	@Override
	public void getColor(){
		System.out.println("黑人的肤色是黑色的");
	}
	
	@Override
	public void talk(){
		System.out.println("黑人说的话一般人听不懂");
	}

}
