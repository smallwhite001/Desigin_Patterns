package Builder_Pattern;

/**
 * 建造者模式
 * 构建组件和装配组件在不同阶段
 * 装配组建的时候需要将构建的组件传入
 */
public class Client {

    public static  void main(String[] args){
        /**
         * 需要一个构造者，否则装配组件的时候会报空指针异常
         *
         */
        AirShipDirectorImpl airShipDirector = new AirShipDirectorImpl(new AirShipBuilderImpl());
        AirShip ship =  airShipDirector.createAirShip();
        System.out.println(ship);
    }
}
