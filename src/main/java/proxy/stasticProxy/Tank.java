package proxy.stasticProxy;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 11:02
 */
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("tank move....");
    }


    public static void main(String[] args) {
        new TankLogProxy(new TankTimeProxy(new Tank())).move();
    }
}


class TankTimeProxy implements Movable {

    Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("time record...before");
        m.move();
        System.out.println("time record...after");
    }
}


class TankLogProxy implements Movable {

    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("log record...before");
        m.move();
        System.out.println("log record...after");
    }
}


interface Movable {

    void move();
}