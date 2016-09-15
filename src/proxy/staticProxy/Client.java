package proxy.staticProxy;

import java.util.Date;

public class Client {
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("张三") ; 
		GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(player) ; 
		System.out.println("开始时间为:" + new Date());
		gamePlayerProxy.login("zhangsan","xxxxxx");
		gamePlayerProxy.killBoss();  
		gamePlayerProxy.upgrade();
		
	}
}
