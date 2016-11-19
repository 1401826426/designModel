package proxy.dynamic.cglibProxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
public class CglibProxy implements MethodInterceptor{

	private Enhancer enhancer = new Enhancer() ; 
	
	public Object  getProxy(@SuppressWarnings("rawtypes") Class clazz){
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create() ; 
	}
	
	/**
	 * ��������Ŀ���෽���ĵ���
	 * obj  Ŀ�����ʵ��
	 * m Ŀ�귽���ķ������
	 * args �����Ĳ���
	 * proxy  �������ʵ��
	 */
	@Override
	public Object intercept(Object obj, Method m, Object[] args, MethodProxy proxy) throws Throwable {
		 //��������ø���ķ���
		System.out.println("��־��ʼ����������������������������������");
//		proxy.invokeSuper(obj, args) ; 
		proxy.invoke(obj, args) ; 
		System.out.println("��־����......................");
		return null;
	}
	
}
