package Factory_Pattern;

/**
 * 简单工厂模式
 * 创建Audi、Byd
 */
public class Simple_Factory {
    public Audi createAudi(){
        return new Audi();
    }
    public Byd createByd(){
        return  new Byd();
    }
}
