package singleton;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:03
 */
public enum LazyLoad6 {

    INSTANCE;

    public static LazyLoad6 getInstance() {
        return INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(LazyLoad6.getInstance().hashCode())).start();
        }
    }
}
