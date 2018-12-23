package Adapter_Pattern;

/**
 *对象组合方式实现适配器
 */
public class Adapter2 implements Target {
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void handRequest() {
        this.adaptee.request();
    }
}
