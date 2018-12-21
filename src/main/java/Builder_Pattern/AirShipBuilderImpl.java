package Builder_Pattern;

public class AirShipBuilderImpl implements AirShipBuilder {
    public Engine buildEngine() {

        return new Engine("引擎");
    }

    public OrbitalMoudle buildOrbitalMoudle() {
//        System.out.println("创建船舱");
        return new OrbitalMoudle("创建船舱");

    }

    public EscapeTower buildEscapeTower() {
//        System.out.println("创建逃生舱");
            return new EscapeTower("创建逃生舱") ;
    }
}
