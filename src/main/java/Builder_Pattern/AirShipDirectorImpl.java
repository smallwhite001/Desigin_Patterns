package Builder_Pattern;

/**
 * 装配飞船
 */
public class AirShipDirectorImpl implements AirShipDirector {
    //引入组件
    private AirShipBuilderImpl airShipBuilder;

    public AirShipDirectorImpl(AirShipBuilderImpl airShipBuilder) {
           this.airShipBuilder = airShipBuilder;
    }

    public AirShip createAirShip() {
        //装配组件
        Engine e = airShipBuilder.buildEngine();
        EscapeTower es = airShipBuilder.buildEscapeTower();
        OrbitalMoudle o = airShipBuilder.buildOrbitalMoudle();
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(es);
        ship.setOrbitalMoudle(o);
        return ship;
    }
}
