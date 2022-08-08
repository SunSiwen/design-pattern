package state;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 13:06
 */
public class MM {
    String name;
    MMState state = new MMHappyState();

    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }

}