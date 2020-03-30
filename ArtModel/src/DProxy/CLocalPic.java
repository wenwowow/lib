package DProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CLocalPic {
	private Object target;
	public CLocalPic(Object target) {
		super();
		this.target=target;
	}
	public Object getProxyInatance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), 
				new InvocationHandler() {

					@Override
					public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
						System.out.println("◊º±∏‘ÿ»ÎÕº∆¨"+arg2[0].toString());
						Thread th=new Thread(new Runnable() {
							@Override
							public void run() {
								try {
									arg1.invoke(target, arg2);
								} catch (IllegalAccessException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IllegalArgumentException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (InvocationTargetException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
						});
						th.start();
						return null;
					}
			
		});
	}
}
