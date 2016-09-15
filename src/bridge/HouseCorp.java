package bridge;

public class HouseCorp extends Corp{

	@Override
	protected void produce() {
		System.out.println("房地产公司盖房子.......");
	}

	@Override
	public void sell() {
		System.out.println("房地产公司出售房子...........");
	}
	
	public void makeMoney(){
		super.makeMoney(); 
		System.out.println("房地产公司赚大钱............");
	}

}
