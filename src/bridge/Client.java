package bridge;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("----------���ز���˾���������е�-----------------");
		HouseCorp houseCorp = new HouseCorp() ; 
		houseCorp.makeMoney();
		System.out.println("----------��װ��˾���������е�------------------");
		ClothesCorp clothCorp = new ClothesCorp() ; 
		clothCorp.makeMoney();  
	}
}
































