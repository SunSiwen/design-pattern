package strategy;

import java.util.Comparator;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:55
 */
public class CatAgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) {
            return -1;
        } else if (o1.getAge() < o2.getAge()) {
            return 1;
        }
        return 0;
    }
}
