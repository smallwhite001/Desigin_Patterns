package Adapter_Pattern;

import org.junit.Test;

/**
 * 测试:笔记本
 */
public class Client {
    public void test(Target target){
        target.handRequest();
    }
 public static void main(String[] args){
     Client client  = new Client();
    // Adaptee adaptee = new Adaptee();
     Target target = new Adapter();
     client.test(target);
 }
}
