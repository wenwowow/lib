package D_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler{
	private Object proxied;
	public MyProxy(Object proxied) {
		this.proxied=proxied;
	}
	@Override
	public Object invoke(Object proxy,Method method,Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		method.invoke(this.proxied,args);
		System.out.println("����ʱ�䣺"+System.currentTimeMillis());
		return null;
	}
}
