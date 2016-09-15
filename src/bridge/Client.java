package bridge;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("----------房地产公司设这样运行的-----------------");
		HouseCorp houseCorp = new HouseCorp() ; 
		houseCorp.makeMoney();
		System.out.println("----------服装公司是这样运行的------------------");
		ClothesCorp clothCorp = new ClothesCorp() ; 
		clothCorp.makeMoney();  
	}
}
































