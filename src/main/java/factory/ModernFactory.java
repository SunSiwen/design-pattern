package factory;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 16:33
 */
public class ModernFactory extends  AbstractFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}
