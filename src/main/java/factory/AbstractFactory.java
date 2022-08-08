package factory;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 16:32
 */
public abstract class AbstractFactory {

    public abstract Vehicle createVehicle();

    public abstract Food createFood();

    public abstract Weapon createWeapon();

}
