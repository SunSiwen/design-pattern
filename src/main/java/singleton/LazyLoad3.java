package singleton;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:03
 */
public class LazyLoad3 {

    private static LazyLoad3 INSTANCE = null;

    private LazyLoad3() {

    }

    //static lock class
    public static LazyLoad3 getInstance() {
        //semi-initialization
        // thread unsafe
        if (INSTANCE == null) {
            synchronized (LazyLoad3.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new LazyLoad3();
            }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(LazyLoad3.getInstance().hashCode())).start();
        }
    }
}
