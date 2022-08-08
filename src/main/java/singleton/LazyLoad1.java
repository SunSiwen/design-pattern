package singleton;

import java.sql.SQLOutput;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:03
 */
public class LazyLoad1 {

    private static LazyLoad1 INSTANCE = null;

    private LazyLoad1(){

    }

    public static LazyLoad1 getInstance() {
        //semi-initialization
        // thread unsafe
        if(INSTANCE == null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new LazyLoad1();
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(LazyLoad1.getInstance().hashCode())).start();
        }
    }
}
