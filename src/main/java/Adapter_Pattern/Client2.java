package Adapter_Pattern;

public class Client2 {
    public void  test(Target target){
        target.handRequest();
    }
    public static void main(String[] args){
        Client2 client2 = new Client2();

        Adapter2 adapter2  = new Adapter2(new Adaptee());

        adapter2.handRequest();
    }
}
