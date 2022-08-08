package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 23:21
 */
public class Child {

    private List<Observer> list;

    public Child() {
        list = new LinkedList<>();
    }

    public Child addObserver(Observer observer) {
        list.add(observer);
        return this;
    }


    private void wakeUp() {
        System.out.println("crying...");
        for (Observer observer : list) {
            observer.actionOnWakeUp();
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        Dad dad = new Dad();
        Dog dog = new Dog();
        child.addObserver(dad).addObserver(dog);

        child.wakeUp();
    }


}
