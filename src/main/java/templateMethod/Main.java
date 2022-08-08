package templateMethod;

/**
 * @author Siwen Sun
 * @date 2022/08/08/ 12:56
 */
public class Main {
    public static void main(String[] args) {
        F f = new C1();
        f.m();
    }

}

abstract class F {
    public void m() {
        op1();
        op2();
    }

    abstract void op1();
    abstract void op2();
}

class C1 extends F {

    @Override
    void op1() {
        System.out.println("op1");
    }

    @Override
    void op2() {
        System.out.println("op2");
    }
}
