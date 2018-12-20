package Test;

import Singleton_Pattern.Singleton_Hunger;
import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.lang.reflect.Constructor;

/**
 * 通过反射 破解单例模式(除了枚举，其他都可以进行破解)
 */
public class Test_Singleton_ByReflect {
    @Test
    public void testSingletonByReflect() {
        try {
            Class clazz = Class.forName("Singleton_Pattern.Singleton_Hunger");
            Constructor<Singleton_Hunger> constructor = clazz.getDeclaredConstructor();
            //设置访问私有属性
            constructor.setAccessible(true);
            Singleton_Hunger instance1 = constructor.newInstance();
            Singleton_Hunger instance2 = constructor.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
