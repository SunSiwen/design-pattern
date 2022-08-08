package observer;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 23:20
 */
public class Dad implements Observer{
    @Override
    public void actionOnWakeUp() {
        System.out.println("911.....");
    }
}
