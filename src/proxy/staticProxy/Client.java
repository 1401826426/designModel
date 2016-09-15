package proxy.staticProxy;

import java.util.Date;

public class Client {
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("����") ; 
		GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(player) ; 
		System.out.println("��ʼʱ��Ϊ:" + new Date());
		gamePlayerProxy.login("zhangsan","xxxxxx");
		gamePlayerProxy.killBoss();  
		gamePlayerProxy.upgrade();
		
	}
}
