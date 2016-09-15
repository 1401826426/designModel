package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Date;

public class Client {
	public static void main(String[] args) {
		
		IGamePlayer gamePlayer = new GamePlayer("张三") ;
		InvocationHandler handler = new GamePlayerIH(gamePlayer) ;
		System.out.println("开始时间位 " + new Date());
		ClassLoader cl = gamePlayer.getClass().getClassLoader() ; 
		IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl ,gamePlayer.getClass().getInterfaces(),handler) ;
		proxy.login("zhangsan", "xxxxxx");
		proxy.killBoss();  
		proxy.upgrade();
		
		
	}
}
