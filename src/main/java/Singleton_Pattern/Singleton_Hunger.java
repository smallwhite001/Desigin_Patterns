package Singleton_Pattern;

/**
 * 饿汉式单例模式
 */
public class Singleton_Hunger {
     //私有化构造器，别的方法就不能随意创建该对象的实例了
     private Singleton_Hunger(){ }
     //类初始化加载时候，立即加载该对象，加载该类时候线程是安全的
     private static final Singleton_Hunger singleton_hunger = new Singleton_Hunger();

     public static Singleton_Hunger getSingleton(){
         return singleton_hunger;
     }


}
