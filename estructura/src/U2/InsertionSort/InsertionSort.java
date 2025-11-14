package U2.InsertionSort;

import java.util.Comparator;

public class InsertionSort {
    public static <T extends Comparable<T>> void sort(T[] array, Comparator<T> comparator){
        int n = array.length;
        for(int i = 1; i < n; i++){
            T temp = array[i];
            int j = i - 1;
            while(j >= 0 && comparator.compare(array[j], temp) > 0){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        System.out.println( java.util.Arrays.toString(array));
    }
}
