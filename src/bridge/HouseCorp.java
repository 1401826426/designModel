package bridge;

public class HouseCorp extends Corp{

	@Override
	protected void produce() {
		System.out.println("���ز���˾�Ƿ���.......");
	}

	@Override
	public void sell() {
		System.out.println("���ز���˾���۷���...........");
	}
	
	public void makeMoney(){
		super.makeMoney(); 
		System.out.println("���ز���˾׬��Ǯ............");
	}

}