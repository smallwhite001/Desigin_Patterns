package Singleton_Pattern;

/**
 * 饱汉式
 */
public class Singleton_Full {
    //私有化构造器
    private static void Singleton_Full() {
    }
    //类初始化时，不加载这个对象（延迟加载，真正用的时候在创建）
    private static Singleton_Full singleton_full = null;

    /**
     * synchronized:代码同步
     * 防止多线程访问时候创建的对象不是同一个
     *
     * @return
     */
    public synchronized static Singleton_Full getSingleton_full() {
        if (singleton_full == null) {
            singleton_full = new Singleton_Full();
        }
       return singleton_full;
    }
}
