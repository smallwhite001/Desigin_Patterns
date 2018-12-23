package Bridge_Pattern;

public class test {
    public static void main(String[] args) {
        //白色
        Color white = new White();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();
    }

}