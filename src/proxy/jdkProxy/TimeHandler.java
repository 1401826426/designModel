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
		System.out.println("������ʼ��ʻ");
		method.invoke(target) ; 
		System.out.println("������ʻ����");
		Long end = System.currentTimeMillis() ; 
		System.out.println("������ʻʱ��   " + (end-start));
		return null	;
	}
}













