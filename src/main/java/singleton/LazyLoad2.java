package singleton;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:03
 */
public class LazyLoad2 {

    private static LazyLoad2 INSTANCE = null;

    private LazyLoad2(){

    }

    //static lock class
    public static synchronized LazyLoad2 getInstance() {
        //semi-initialization
        // thread unsafe
        if(INSTANCE == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new LazyLoad2();
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(LazyLoad2.getInstance().hashCode())).start();
        }
    }
}
