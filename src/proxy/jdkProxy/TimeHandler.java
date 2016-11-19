package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{
	private Object target ; 
	public TimeHandler(Object obj){
		this.target =  obj ; 
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Long  start = System.currentTimeMillis() ; 
		System.out.println("汽车开始行驶");
		method.invoke(target) ; 
		System.out.println("汽车行驶结束");
		Long end = System.currentTimeMillis() ; 
		System.out.println("汽车行驶时间   " + (end-start));
		return null	;
	}
}













