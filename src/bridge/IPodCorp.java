package bridge;

public class IPodCorp extends Corp{

	@Override
	protected void produce() {
		System.out.println("������ipod......");
	}

	@Override
	public void sell() {
		System.out.println("ipod����");
	}

	public void makeMoney(){
		super.makeMoney();  
		System.out.println("��׬Ǯ��!!!!");
	}
}
