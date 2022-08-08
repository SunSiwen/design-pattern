package singleton;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:03
 */
public class LazyLoad4 {

    private static /**volatile**/
            LazyLoad4 INSTANCE = null;

    private int a;

    private LazyLoad4() {
        a = 20;
    }

    //static lock class
    public static LazyLoad4 getInstance() {
        //reorder instructions
        if (INSTANCE == null) {
            synchronized (LazyLoad4.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new LazyLoad4();
                }
            }
        }
        return INSTANCE;
    }

    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(LazyLoad4.getInstance().hashCode())).start();
        }
    }
}
