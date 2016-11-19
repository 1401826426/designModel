package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	
	public static void main(String[] args) {
		Car car = new Car() ; 
		InvocationHandler h = new TimeHandler(car) ; 
		Class<?> cls = car.getClass() ; 
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h) ;
		System.out.println(m.getClass().getName());
		m.move();
	}
	
}
