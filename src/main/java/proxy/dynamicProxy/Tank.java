package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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

        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        Movable o = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, new TankTimeHandler(new Tank()));
    }
}


class TankTimeHandler implements InvocationHandler {

    Movable m;

    public TankTimeHandler(Movable m) {
        this.m = m;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("time record...before");
        m.move();
        System.out.println("time record...after");
        return null;
    }
}
//
//
//class TankLogProxy implements Movable {
//
//    Movable m;
//
//    public TankLogProxy(Movable m) {
//        this.m = m;
//    }
//
//    @Override
//    public void move() {
//        System.out.println("log record...before");
//        m.move();
//        System.out.println("log record...after");
//    }
//}
//

interface Movable {

    void move();
}