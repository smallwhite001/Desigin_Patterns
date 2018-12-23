package Proxy_Pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler {

    private Object target = null;
    public Object getProxy(Object obj){
        this.target = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开启事务");
        Object object = method.invoke(target,args);
        System.out.println("提交事务");
        return object;
    }
}
