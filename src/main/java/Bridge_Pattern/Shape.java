package Bridge_Pattern;

/**
 * 首先是形状类：该类为一个抽象类，主要提供画形状的方法
 */
public abstract class Shape {
    Color color;//作为shape一个属性

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}