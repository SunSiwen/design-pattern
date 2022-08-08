package singleton;

import java.lang.reflect.Constructor;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:03
 */
public class LazyLoad5 {

    private LazyLoad5() {

    }

    private static class LazyLoad5Holder{
        private static LazyLoad5 INSTANCE = new LazyLoad5();

    }

    public static LazyLoad5 getInstance() {
        return LazyLoad5Holder.INSTANCE;
    }


    public static void main(String[] args) throws Exception {
        Class<LazyLoad5> lazyLoad5Class = LazyLoad5.class;
        Constructor<LazyLoad5> declaredConstructor = lazyLoad5Class.getDeclaredConstructor();
        LazyLoad5 lazyLoad5 = declaredConstructor.newInstance();
        LazyLoad5 lazyLoad = declaredConstructor.newInstance();
        System.out.println(lazyLoad == lazyLoad5);


//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> System.out.println(LazyLoad5.getInstance().hashCode())).start();
//        }
//

    }
}
