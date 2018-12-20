package Test;

import Singleton_Pattern.Singleton_Full;
import Singleton_Pattern.Singleton_Hunger;
import org.junit.Test;

public class Test_Singleton {
    @Test
    public void testSingleton_Hunger(){
        Singleton_Hunger singletonHunger1 = Singleton_Hunger.getSingleton();
        Singleton_Hunger singletonHunger2 = Singleton_Hunger.getSingleton();
        System.out.println(singletonHunger1.equals(singletonHunger2));
        System.out.println(singletonHunger1 == singletonHunger2);
    }
    @Test
   public void testSingleton_Full(){
       Singleton_Full singleton_full1 = Singleton_Full.getSingleton_full();
       Singleton_Full singleton_full2 = Singleton_Full.getSingleton_full();
       System.out.println(singleton_full1==singleton_full2 &&  singleton_full1.equals(singleton_full2));
   }
}
