package Singleton_Pattern;

/**
 * 静态内部类实现单例模式
 * 懒加载
 * 线程安全(内部类线程安全)
 * 执行效率高
 * 外部类没有static，不会像饿汉式那样立即加载对象
 * 只有真正调用getInstance()才会加载内部类，加载类时候线程是安全的，instance是static，保证了只有一个实例存在
 */
public class Singleton_InnerClass {
    private static class Singleton_InnerClassInstance{
         private  static Singleton_InnerClass instance = new Singleton_InnerClass();
    }
    //私有化构造方法
    private Singleton_InnerClass(){}

    private static  Singleton_InnerClass getInstance(){
        return Singleton_InnerClassInstance.instance;
    }


}
