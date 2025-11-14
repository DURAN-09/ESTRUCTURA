package U2.SelectionSort;

public class SelectionSort{
    public static <T extends Comparable<T>> void sort(T[] array){
        int minIndex = 0;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[minIndex].compareTo(array[j]) > 0){
                    minIndex = j;
                }
            }
            T temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
