package Prototype_Pattern;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Date;

public class test_Deep_Clone {
    /**
     * 深复制
     * @throws CloneNotSupportedException
     */
    @Test
    public void test_Deep_Clone() throws CloneNotSupportedException {
        Deep_Clone deep_clone = new Deep_Clone();
        deep_clone.setName("white");
        deep_clone.setBirthday(new Date(123456));
        System.out.println(deep_clone.getBirthday()+"克隆前");
        Deep_Clone deep_clone2 = (Deep_Clone) deep_clone.clone();
        deep_clone.setBirthday(new Date(1234444));
        System.out.println(deep_clone.getBirthday()+"原型对象改变值");
        System.out.println(deep_clone2.getBirthday()+"克隆后改变原型对象值后");
        deep_clone2.setBirthday(new Date(1111111));
        System.out.println(deep_clone2.getBirthday()+"克隆后新增值");


    }
}
