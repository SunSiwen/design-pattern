package factory;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 16:34
 */
public class MagicFactory extends AbstractFactory{
    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Food createFood() {
        return new Mushroom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}
