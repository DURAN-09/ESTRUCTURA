package U2.InsertionSort;

public class App {
    public static void main(String[] args){
        Integer[] array = {5,1,9,10,3,5};
        String[] otro = {"hjshd", "s", "ADF","kjjkskskx", "      ", "e234"};
        InsertionSort.sort(array, Integer::compareTo);
        InsertionSort.sort(otro, (a, b) -> a.length() - b.length());
    }
}
