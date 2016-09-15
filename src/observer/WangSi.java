package observer;

public class WangSi implements Observer{

	@Override
	public void update(String context) {
		System.out.println("王斯 ：韩非子开始活动了，我也要开始活动了.......");
		this.cry(context) ; 
		System.out.println("王斯： 哭死了.........");
	}

	private void cry(String context) {
		System.out.println("因为" + context + "所以我悲伤啊！！！！！！！");
	}
	

}
