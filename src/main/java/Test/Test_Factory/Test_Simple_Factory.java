package Test.Test_Factory;

import Factory_Pattern.Audi;
import Factory_Pattern.Byd;
import Factory_Pattern.Simple_Factory;
import org.junit.Test;

/**
 * 测试简单工厂类
 */
public class Test_Simple_Factory {
    @Test
    public void testSimpleFactory(){
        Audi audi = new Simple_Factory().createAudi();
        audi.run();
        Byd  byd  = new Simple_Factory().createByd();
        byd.run();
    }
}
