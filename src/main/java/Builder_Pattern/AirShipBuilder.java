package Builder_Pattern;
import Builder_Pattern.AirShip;
/**
 * 飞船组建创建
 */
public interface AirShipBuilder {
     Engine buildEngine();

     OrbitalMoudle buildOrbitalMoudle();

     EscapeTower buildEscapeTower();

}
