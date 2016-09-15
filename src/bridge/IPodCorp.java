package bridge;

public class IPodCorp extends Corp{

	@Override
	protected void produce() {
		System.out.println("我生产ipod......");
	}

	@Override
	public void sell() {
		System.out.println("ipod畅销");
	}

	public void makeMoney(){
		super.makeMoney();  
		System.out.println("我赚钱啊!!!!");
	}
}
