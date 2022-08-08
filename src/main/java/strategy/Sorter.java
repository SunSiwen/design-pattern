package strategy;

import java.util.Comparator;

/**
 * @author Siwen Sun
 * @date 2022/08/07/ 15:31
 */
public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <= arr.length - 1 - i; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) == 1) {
                    T temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
