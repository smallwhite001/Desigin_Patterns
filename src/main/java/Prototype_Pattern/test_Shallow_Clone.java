package Prototype_Pattern;

import org.junit.Test;

import java.util.Date;

public class test_Shallow_Clone {
    @Test
    public void test_Shallow_Clone() throws CloneNotSupportedException {
        Shallow_Clone shallow_clone = new Shallow_Clone();
        shallow_clone.setName("Small");
        shallow_clone.setBirthday(new Date(111223344));
        System.out.println(shallow_clone.getName());
        System.out.println(shallow_clone.getBirthday()+"修改前");

        //克隆出来的对象
        Shallow_Clone shallow_clone2 = (Shallow_Clone) shallow_clone.clone();
        shallow_clone.setBirthday(new Date(123456));
        System.out.println(shallow_clone.getBirthday()+"修改后");

        System.out.println(shallow_clone2.getName());
        System.out.println(shallow_clone2.getBirthday());
    }
}
