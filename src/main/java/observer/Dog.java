package observer;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 23:20
 */
public class Dog implements Observer{
    @Override
    public void actionOnWakeUp() {
        System.out.println("wang~");
    }
}
