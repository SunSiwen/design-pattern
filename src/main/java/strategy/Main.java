package strategy;

import java.util.Comparator;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:29
 */
public class Main {

    public static void main(String[] args) {
//        int[] arr = {34, 1345, 2345, 1234, 346, 24, 123, 413, 451, 234, 15};

        Cat[] arr = {new Cat("a", 1, 2222),
                new Cat("b", 11, 222),
                new Cat("c", 111, 22),
                new Cat("d", 111, 2),
        };

        Sorter<Cat> sorter = new Sorter<>();
//
//        sorter.sort(arr, new CatAgeComparator());
//        sorter.sort(arr, new CatWeightComparator());
        sorter.sort(arr, (o1, o2) -> {
            if (o1.getWeight() > o2.getWeight()) {
                return 1;
            } else if (o1.getWeight() < o2.getWeight()) {
                return -1;
            }
            return 0;
        });

        for (Cat i : arr) {
            System.out.println(i);
        }

    }
}
