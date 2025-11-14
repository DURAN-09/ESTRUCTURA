package U2.SelectionSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args){
        Integer[] array = {5,1,9,10,9,3,9};
        System.out.println(Arrays.toString(array));
        SelectionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
