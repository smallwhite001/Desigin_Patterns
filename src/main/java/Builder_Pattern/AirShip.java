package Builder_Pattern;

public class AirShip {
    /**
     * 飞船组件
     */
    private  Engine engine;
    private  OrbitalMoudle orbitalMoudle;
    private  EscapeTower escapeTower;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public OrbitalMoudle getOrbitalMoudle() {
        return orbitalMoudle;
    }

    public void setOrbitalMoudle(OrbitalMoudle orbitalMoudle) {
        this.orbitalMoudle = orbitalMoudle;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }


}
/**
 * 引擎类
 */

class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 class OrbitalMoudle{
    private String  name;

    public OrbitalMoudle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
