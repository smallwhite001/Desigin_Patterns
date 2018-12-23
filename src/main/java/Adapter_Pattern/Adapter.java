package Adapter_Pattern;

/**类适配器
 * 转接口
 */
public class Adapter  extends Adaptee implements Target {
    public void handRequest() {
        super.request();
    }

}
