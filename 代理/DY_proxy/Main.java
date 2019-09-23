package DY_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("eat")) {
                    System.out.println("today,eating " + args[0]);
                }
                if (method.getName().equals("drink")) {
                    System.out.println("today,drinking " + args[0]);
                }
                return null;
            }
        };
        Day day = (Day) Proxy.newProxyInstance(
            Day.class.getClassLoader(), // 传入ClassLoader
            new Class[] { Day.class }, // 传入要实现的接口
            handler); // 传入处理调用方法的InvocationHandler
        day.eat("apple");
        day.drink("water");
    }
}
