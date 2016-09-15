package observer;

public class Client {
	
	public static void main(String[] args) {
		Observer liSi = new LiSi() ;
		Observer wangSi = new WangSi() ; 
		
		HanFeiZi hanfeiZi = new HanFeiZi() ; 
		hanfeiZi.addObserver(liSi);
		hanfeiZi.addObserver(wangSi);
		hanfeiZi.havaBreakfast(); 
		hanfeiZi.haveFun() ; 
		
		
	}
}
